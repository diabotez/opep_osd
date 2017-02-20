a=input('¿Tamaño de lista de espera? '); % Pacientes en la lista de espera
Dias=input('¿Dias a planificar? '); %Numero de dias a planificar
Por_obje = input('¿Porcentaje de ocupacion objetivo? '); %Porcentaje ocupacion objetivo
Tiem_tot = input('¿Duración de una jornada [horas]? '); % Horas jornada
Beta = input('¿Peso de orden [0.333 , 3] VS Peso ocupacion=1? '); %Peso orden VS Peso Ocupacion = 1
tole = input('¿Tolerancia en porcentjae permitida? '); % cotas que mejoran en tiempo de computo. 
m=7;%Dias a planificar en cada iteración.
Sel=5; % Dias a operar de los m planificados en cada iteracion
T_progr = (Tiem_tot*60*Por_obje/100); % Minutos objetivo a programar
%[Lista,n]=GeneraDatos(a) %Genera una lista de operaciones a realizar de tamaño comprendido entre a y b.
 load ('Lista')
L=Lista;
 matOp=[];
 w=0;
 i=0;
 mu_L=Lista(4,:);
 sigma_L=Lista(5,:);
while w < Dias 
    [u,r]=size (L);
    if r ~= 0
    [Op,Ocu,xmin,val,fi] = Planificacion(T_progr,L,m,Beta,Tiem_tot,tole); %Planifica operaciones para m dias.
    matOpi=[];
    for i=1:Sel
        Opi=[];
        Si=Op(i,:);
        tam=0;
        [x,y]=size(L);
        for j=1:y
            if (int16(Si(1,j))== 1)
                Opi=[Opi, L(1,j)];
            end
        end
        while length(Opi)<int16(T_progr/112+2)  
            Opi=[Opi 0];
        end
        Media=Ocu(i)+Si*L(4,:)'-10;
        des2=L(3,:).^2+L(5,:).^2;
        Desviacion=sqrt(Si*des2'-10^2+12^2);
        Oci=Ocu(i,1)/(Tiem_tot*60)*100;
        confianza110=normcdf(1.1*Tiem_tot*60,Media,Desviacion);
        confianza100=normcdf(Tiem_tot*60,Media,Desviacion);
        Opi=[Opi, Oci, confianza100*100, confianza110*100];
        eval(['Dia_' num2str(i+w) '=[Opi]'])
        matOpi=[matOpi; Opi];
       
    end
    matOp=[matOp; matOpi];
    N_L = UpLoad(matOpi, L, Sel);
    L=N_L;
    w=w+Sel;
    else
        w=Dias;
    end
end
matOpp=[];
[e,o]=size(matOp);
for i=1:e
    if (matOp(i,1)~= 0)
        matOpp=[matOpp; matOp(i,:)];
    end
end      

[f,c]=size(matOpp);
V_ocup=matOpp(:,c-2);
V_conf=matOpp(:,c-1);
OcuMedia=mean(V_ocup);
stdOcu=std(V_ocup);
Maximo=max(V_ocup);
Minimo=min(V_ocup);
ConfMedia=mean(V_conf);
stdcon=std(V_conf);
Maximoconfi=max(V_conf);
Minimoconfe=min(V_conf);


atraso=[];
Natrasos=[];
ind=[];
for j=1:f
    atraso_j=0;
    Natrasos_j=0;
    indic_j=0;
    for i=1:c-3
        if int16(matOpp(j,i)) ~= 0
            paciente=(matOpp(j,i));
            valoratraso=3*(j-1)+1;
            if paciente<valoratraso
                atraso_paciente=j-ceil(paciente/3);
                atraso_j=atraso_j+atraso_paciente;
                indic_j=indic_j+atraso_paciente^2;
                Natrasos_j=Natrasos_j+1;
            end
        end
    end
    atraso=[atraso atraso_j];
    Natrasos=[Natrasos Natrasos_j];
    Pers=sum(Natrasos);
    ind=[ind indic_j];
  
    
end
atraso;
Natrasos;
ind;
indicador=sum(ind);

Solucion=[Maximo OcuMedia Minimo stdOcu
    Maximoconfi ConfMedia Minimoconfe stdcon
    indicador Pers 0 0]
    