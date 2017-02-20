%muestra las operaciones que realiza cada dia el porcentaje de ocupacion
%de quirofano, la ocupacion media y su desviación.

a=input('¿Tamaño de lista de espera? '); % Tamaño de lista de espera
%a=100;
m=input('¿Dias a planificar (<7)? '); %Dias a planificar.
%m=7;
Por_obje = input('¿Porcentaje de ocupacion objetivo? '); %Porcentaje objetivo
%Por_obje = 80;
Tiem_tot = input('¿Duración de una jornada [horas]? '); % horas
%Tiem_tot =7;
Beta = input('¿Peso de orden [0.333 , 3] VS Peso ocupacion=1? '); %Peso orden VS Peso Ocupacion = 1
%Beta =0.333;
T_progr = (Tiem_tot*60*Por_obje/100); %Minutos a programar por jornada, teniendo en cuenta 30
                                           %min de limpieza de quirofano tras cada operacion.
[Lista,n]=GeneraDatos(a) %Genera una lista de operaciones a realizar de tamaño comprendido entre a y b.
[Op,Ocu,xmin] = Planificacion(T_progr,Lista,m,Beta,Tiem_tot); %Planifica operaciones para m dias. Op es una matriz en la que cada fila es un dia y ocu es un vector columna con el tiempo de ocupacion de quirofano.
matOp=[];
for i=1:m
    Opi=[];
    Si=Op(i,:);
    tam=0;
    for j=1:n
        if (int16(Si(1,j))== 1)
            Opi=[Opi, j];
        end
    end
    while length(Opi)<int16(T_progr/112+1) 
        Opi=[Opi 0];
    end
    Oci=Ocu(i,1)/(Tiem_tot*60)*100;
    Opi=[Opi, Oci];
    eval(['Dia_' num2str(i) '=[Opi]'])
    matOp=[matOp; Opi];
end
[f,c]=size(matOp);
V_ocup=matOp(:,c);
OcuMedia=mean(V_ocup)
stdOcu=std(V_ocup)