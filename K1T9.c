#include<stdio.h>
#include<stdlib.h>
int main(){
    int N ; 
    while (scanf("%d" , &N) == 1 && N != -1 )
    {
        double *a = (double*)malloc(N * sizeof(double));
        if (a == NULL)
        {
            return 1;
        }
        for (int i = 0; i < N; i++)
        {
            scanf("%lf" , &a[i]);
        }
        double x;
        while(scanf("%lf", &x)== 1 && x != 0)
        {
            double y = 0.0;
            for(int i = N-1; i >= 0; i--)
            {
                y = y * x + a[i];
            }
            printf("%.1f\n", y);
        }
        free(a);
    }
    return 0;
}