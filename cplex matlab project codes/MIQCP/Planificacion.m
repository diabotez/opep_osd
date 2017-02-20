function [S,Oc,xmin,fval] = Planificacion(T,Lista,m,Beta,tiem_total,confianza)
%FUNCION: Planifica m sesiones de operaciones de la Lista, intentando ajustarse lo maximo posible a una duracion de T (min) por sesion, 
% manteniendo el orden de la lista en la manero de lo posible.
%PARAMETROS DE ENTRADA: - T: tiempo a planificar en minutos: horas de quirofano* % ocupacion deseado - 30(tiempo de limpieza previa)
                        %- Lista: Lista de operaciones
                        %- m: numero de sesiones a planificar.
%PARAMETROS DE SALIDA: - S: Matriz  binaria de operaciones a realizar cada dia. S(i,j)=1 => La operacion j de la Lista, se realiza el dia i.
                      %- Oc: Columna de la ocupacion del quirofano cada dia: Oc(i,1)= 87 => una ocupacion el Dia i igual a 87min 
tiem_total=tiem_total*60;
z=norminv(confianza/100,0,1);
aux=size(Lista);
n=aux(1,2); % tamaño de la lista de espera
% Inicialización de variables.
Peso_orden=Beta;
Sd=[];
Peso_tiempo=1;
ub=[];
Op=[];
T_L=[];
sostype=[];
sosind=[];
soswt=[];
H=[];
c=[];
Q=[];
l=[];
r=[];
A=[];
Ae=[];
be=[];
b=[];
ctype='';
lb=[];
S=[];
Oc=[];
orden=[];
Vsigma_L=[];
Vmu_L=[];
%for i=1:m
%    lb=[lb; 0];
%    ub=[ub; tiem_total];
%end
%lb=[zeros(n*m,1); lb];
%ub=[ones(n*m,1); ub];
for i=1:n
    orden=[orden i];
end
Vsigma_L=Lista(5,:);
Vmu_L=Lista(4,:);
stddv=Lista(3,:); % vector fila con la des tip de cada operacion de la lista.
sigma2=stddv.^2;
Vsigma_L2=Vsigma_L.^2;
V30=Lista(2,:);% vector fila con la duracion de cada operacion de la lista.
for i=1:m
    c=[c orden*Peso_orden*(m-i+1)]; % vector c de funcion objetivo. Representa la suma de las posiciones de cada operacion en la lista.
end
for i=1:m
    c=[c Peso_tiempo*(m-i+1)]; % vector c de la funcion objetivo. Representa la suma de las desviaciones de tiempos respecto al tiempo objetivo planificadodo
end
c=c'; %vector c en columna

%primeras condiciones de la matriz A y b
%param.lpsolver =2;
D=V30+Vmu_L;

for i=1:m
    row3=[zeros(1,(i-1)*n) D zeros(1, n*(m-i)) zeros(1,i-1) 0 zeros(1,m-i)];
    A=[A ; row3];
    b=[b; tiem_total+10];
    % ctype=sprintf('%sUL',ctype);  % Menor o igual, mayor o igual.
    ctype=sprintf('%sC',ctype); % m variables enteras (min).
    for j=1:n
        ctype=sprintf('B%s',ctype); % n*m variables binarias
    end
end

for i=1:m
    row1=[zeros(1,(i-1)*n) V30 zeros(1, n*(m-i)) zeros(1,i-1) 1 zeros(1,m-i)];
    Ae=[Ae ; row1];
    be=[be;tiem_total]; % vector de terminos independientes b
end


%segundas condiciones de la matriz A y b
fila=[];
%param.itlim = 300;
for i=1:n
    b=[b;1]; % suma de las operaciones i de cada semana debe ser menor que 1
    %ctype=sprintf('%sU',ctype); %menor que
    filan=[zeros(1,i-1) 1 zeros(1,n-i)]; %vector (1 x n) con todo ceros menos en la posicion i que tiene un 1
    for j=1:m
        fila=[fila filan]; % repetir m veces el filan
        
    end
    A=[A; fila zeros(1,m)];  % se añade a la matriz A fila, mas m ceros que corresponden a los alphas.
    fila=[];
end

%Restricciones cuadraticas

K=z^2*(sigma2+Vsigma_L2)+2*(tiem_total+10)*(D);
K=K';
filaq=[];
q=[];
for i=1:n
    for j=1:n
        filaq=[filaq D(i)*D(j)];
    end
    q=[q ;filaq];
    filaq=[];
end
Qc={};
%l=zeros(n*m+m,1)
l=zeros(n*m+m,m);
for i=1:m
    Q=zeros(n*m+m);
    Q((i-1)*n+1:(i-1)*n+n,(i-1)*n+1:(i-1)*n+n)=q;
    %Qc=-Q;
    Qc{1,i}=-Q;
    l((i-1)*n+1:(i-1)*n+n,i:i)=K;
    r=[r (tiem_total+10)^2-z^2*(12^2-10^2)];
end



options = cplexoptimset;
options.Display = 'on';
[xmin,fval] =cplexmiqcp (H, c, A, b, Ae, be, l, Qc, r ,sostype, sosind, soswt, lb, ub, ctype, [], options);
save d
for j=1:m
    Sj=[xmin(n*(j-1)+1:j*n,1)]; % Extrae de xmin cada uno de los vectores soluciones Sj
    S=[S;Sj']; % compone matriz de soluciones por filas
    Ocj=V30*Sj;
    Std=sqrt(stddv.^2*Sj);% calcula el tiempo de ocupacion de quirofano contando los 30 minutos tras cada operacion.
    Sd=[Sd ; Std]; % compone vector columna con la desviacion estandar de la 
    Oc=[Oc ; Ocj];
    
end
end
