function [S,Oc,xmin,val,f] = Planificacion(T,Lista,m,Beta,tiem_total,tole)
%FUNCION: Planifica m sesiones de operaciones de la Lista, intentando ajustarse lo maximo posible a una duracion de T (min) por sesion, 
% manteniendo el orden de la lista en la manero de lo posible.
%PARAMETROS DE ENTRADA: - T: tiempo a planificar en minutos: horas de quirofano* % ocupacion deseado - 30(tiempo de limpieza previa)
                        %- Lista: Lista de operaciones
                        %- m: numero de sesiones a planificar.
%PARAMETROS DE SALIDA: - S: Matriz  binaria de operaciones a realizar cada dia. S(i,j)=1 => La operacion j de la Lista, se realiza el dia i.
                      %- Oc: Columna de la ocupacion del quirofano cada dia: Oc(i,1)= 87 => una ocupacion el Dia i igual a 87min 
aux=size(Lista);
n=aux(1,2); % tamaño de la lista de espera
% Inicialización de variables.
Peso_orden=Beta;
Peso_tiempo=1;
ub=[];
Op=[];
sostype=[];
sosind=[];
soswt=[];
c=[];
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
V30=Lista(2,:); % vector fila con la duracion de cada operacion de la lista.
for i=1:m
    c=[c orden*Peso_orden*(m-i+1)]; % vector c de funcion objetivo. Representa la suma de las posiciones de cada operacion en la lista.
end
for i=1:m
    c=[c Peso_tiempo*(m-i+1)]; % vector c de la funcion objetivo. Representa la suma de las desviaciones de tiempos respecto al tiempo objetivo planificadodo
end
c=c'; %vector c en columna

%primeras condiciones de la matriz A y b
%param.lpsolver =2;
for i=1:m
    row1=[zeros(1,(i-1)*n) V30 zeros(1, n*(m-i)) zeros(1,i-1) -1 zeros(1,m-i)]; % V30*S_i - Alpha_i
    row2=[zeros(1,(i-1)*n) -V30 zeros(1, n*(m-i)) zeros(1,i-1) -1 zeros(1,m-i)];% V30*S_i + Alpha_i
    A=[A ; row1; row2];
    b=[b;T;-T]; % vector de terminos independientes b
    % ctype=sprintf('%sUL',ctype);  % Menor o igual, mayor o igual.
    ctype=sprintf('%sC',ctype); % m variables enteras (min).
    for j=1:n
        ctype=sprintf('B%s',ctype); % n*m variables binarias
    end
end


tole=tole/100;

Desvio_max= tiem_total*60*tole;
for i=1:n*m
    lb=[lb 0];
    ub=[ub 1];
end
for i=1:m
    lb=[lb 0];
    ub=[ub Desvio_max];
end

% lb=[];
% ub=[];
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
options = cplexoptimset;
 options.Display = 'on';
[xmin,val,f] =cplexmilp (c, A, b, Ae, be, lb, ub,sostype, sosind, soswt, ctype, [], options);
f
for j=1:m
    Sj=[xmin(n*(j-1)+1:j*n,1)]; % Extrae de xmin cada uno de los vectores soluciones Sj
    S=[S;Sj']; % compone matriz de soluciones por filas
    Ocj=V30*Sj;
    Oc=[Oc ; Ocj];
    
    % compone vector columna con los diferentes tiempos de ocupacion.
end
end
