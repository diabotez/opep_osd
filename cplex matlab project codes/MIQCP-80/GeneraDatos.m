function [V_e, n] = GeneraDatos (a)
%UNTITLED Genera una lista de tiempos de n operaciones 
% donde n es un numero comprendido entre a y b
V_e=[];
load Datos2;
prob=Proba;
prob=prob';
value=Tiempo;
value=value';
StdDv=Desv;
Limpi=L;
Limpi_des=L_des;
n = a;
id=[];
for i=1:n 
    id =[id  i];
    r=rand;
    proba=cumsum(prob);
    ind=find(r<=proba,1,'first');
    y=value(ind);
    x=StdDv(ind);
    z=Limpi(ind)
    l=Limpi_des(ind);
    k=[y;x;z;l];
    V_e=[V_e k];
end

V_e=[id; V_e]; %Se enumera la lista 

