#include<stdio.h>
#include<string.h>
int main()
{
    int n ;
    while(scanf("%d",&n)!=EOF)
    {
    int A[100][100]={0};
    int x = 0;
    int y = n-1;
    int val = 1;
    A[x][y] = val++;
    while(val<=n*n)
    {
        while(x + 1 < n && !A[x+1][y])
        {
            A[++x][y] = val++;
        }
        while(y - 1 >= 0 && !A[x][y-1])
        {
            A[x][--y] = val++;
        }
        while(x - 1 >= 0 && !A[x-1][y])
        {
            A[--x][y] = val++;
        }
        while(y + 1 < n && !A[x][y+1])
        {
            A[x][++y] = val++;
        }
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
           printf("%d%c",A[i][j],j==n - 1?'\n':' ');
        }
        
    }
}
    return 0;


}