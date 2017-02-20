Rep=50;
tic;

for i=1:Rep
    i
    tStart = tic;
    PlanPrincipal
    tElapsed=toc(tStart);
   
end
averageTime=toc/Rep
