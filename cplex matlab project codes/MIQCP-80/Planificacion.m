function [S,Oc,xmin] = Planificacion(T,Lista,m,Beta,tiem_total,confianza)
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
for i=1:n
    orden=[orden i];
end
stddv=Lista(3,:); % vector fila con la des tip de cada operacion de la lista.
sigma2=stddv.^2;
V30=Lista(2,:);% vector fila con la duracion de cada operacion de la lista.
L=Lista(4,:);% vector fila con la duracion de limpieza de cada operacion de la lista.

sigma_L=Lista(5,:);
sigma_L2=sigma_L.^2;
for i=1:m
    c=[c orden*Peso_orden*(m-i+1)]; % vector c de funcion objetivo. Representa la suma de las posiciones de cada operacion en la lista.
end
for i=1:m
    c=[c Peso_tiempo*(m-i+1)]; % vector c de la funcion objetivo. Representa la suma de las desviaciones de tiempos respecto al tiempo objetivo planificadodo
end
c=c'; %vector c en columna

%primeras condiciones de la matriz A y b
%param.lpsolver =2;
D=V30+L;

for i=1:m
    
    row1=[zeros(1,(i-1)*n) V30 zeros(1, n*(m-i)) zeros(1,i-1) -1 zeros(1,m-i)]; % V30*S_i - Alpha_i
    row2=[zeros(1,(i-1)*n) -V30 zeros(1, n*(m-i)) zeros(1,i-1) -1 zeros(1,m-i)];% V30*S_i + Alpha_i
    row3=[zeros(1,(i-1)*n) D zeros(1, n*(m-i)) zeros(1,i-1) 0 zeros(1,m-i)];
    A=[A ; row1; row2; row3];
    b=[b;T;-T; tiem_total+10]; % vector de terminos independientes b
    % ctype=sprintf('%sUL',ctype);  % Menor o igual, mayor o igual.
    ctype=sprintf('%sC',ctype); % m variables enteras (min).
    for j=1:n
        ctype=sprintf('B%s',ctype); % n*m variables binarias
    end
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

K=z^2*(sigma2+sigma_L2)+2*(tiem_total+10)*(D);
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

Desvio_max= tiem_total*60*0.7;
for i=1:n*m
    lb=[lb 0];
    ub=[ub 1];
end
for i=1:m
    lb=[lb 0];
    ub=[ub Desvio_max];
end

options = cplexoptimset;
options.Display = 'on';
xmin =cplexmiqcp (H, c, A, b, Ae, be, l, Qc, r ,sostype, sosind, soswt, lb, ub, ctype, [], options);
for j=1:m
    Sj=[xmin(n*(j-1)+1:j*n,1)]; % Extrae de xmin cada uno de los vectores soluciones Sj
    S=[S;Sj']; % compone matriz de soluciones por filas
    Ti_Lim=L*Sj;
    Ocj=V30*Sj;
    Std=sqrt(stddv.^2*Sj);% calcula el tiempo de ocupacion de quirofano contando los 30 minutos tras cada operacion.
    Sd=[Sd ; Std]; % compone vector columna con la desviacion estandar de la 
    Oc=[Oc ; Ocj];
    T_L=[T_L ; Ti_Lim];% compone vector columna con los diferentes tiempos de ocupacion.
end
end
