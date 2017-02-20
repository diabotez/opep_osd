function [ New ] = UpLoad(Mat, Old,Selec)
% Elimina de la lista los pacientes ya operados.
aux=size(Old);
n=aux(1,2);
New=[];
[fi,co]=size(Mat);
lon=co-3;
for i=1:Selec
   for j=1:lon
        if int16(Mat(i,j)) ~= 0
            Op_re=int16(Mat(i,j));
            for k=1:n
                if Old(1,k)== Op_re
                    Old(1,k)=0;
                end
            end
        end
    end
end
for i=1:n
    if int16(Old(1,i)) ~= 0
        New=[New Old(:,i)];
    end
end       
New;
end

