#include<stdio.h>
#include<math.h>
const double PI = 3.1415926;

double cosine(double x, double e)
{
    double res = 1.0;
    double term = 1.0;
    for (int i = 1; i < 100000; i++)
    {
        term *= -x * x / (2 * i * (2 * i - 1));
        res += term;
        if (fabs(term) <= e || isnan(term) || isinf(term)) break;
    }
    return res;
}

int main()
{
    double x, e;
    while (scanf("%lf %lf", &x, &e) == 2)
    {
        x = x * PI / 180.0;
        printf("%.8lf\n", cosine(x, e));
    }
    return 0;
}