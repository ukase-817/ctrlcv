#include<stdio.h>
int main()
{
    int T , Ni , alln;
    double Si , alls;
    while(scanf("%d",&T)!=EOF)
    {
    if (T!=0)
    {
        alln = 0 ;
        alls = 0 ;
        for (int i = 1 ; i <= T ; i++)
        {
            scanf("%d %lf",&Ni,&Si);
            printf("%d: %.2lf\n",i,Si*Ni);
            alln += Ni ;
            alls += Si*Ni ;
        }
        printf("%.2lf\n",alls/T);
    
    }
    }
    
    return 0;
}