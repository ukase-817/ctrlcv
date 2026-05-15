#include <stdio.h>
#include <math.h>

#define MAXN 100

double a[MAXN][MAXN+1];

int main() {
    int n;
    while(scanf("%d", &n) == 1) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= n; j++) {
                scanf("%lf", &a[i][j]);
            }
        }

        // Gauss elimination with partial pivoting
        for(int i = 0; i < n; i++) {
            // Find pivot
            int maxj = i;
            for(int j = i + 1; j < n; j++) {
                if(fabs(a[j][i]) > fabs(a[maxj][i])) maxj = j;
            }
            // Swap rows
            if(maxj != i) {
                for(int j = 0; j <= n; j++) {
                    double temp = a[i][j];
                    a[i][j] = a[maxj][j];
                    a[maxj][j] = temp;
                }
            }
            // Eliminate
            for(int j = i + 1; j < n; j++) {
                double factor = a[j][i] / a[i][i];
                for(int k = i; k <= n; k++) {
                    a[j][k] -= factor * a[i][k];
                }
            }
        }

        // Back substitution
        double x[MAXN];
        for(int i = n - 1; i >= 0; i--) {
            x[i] = a[i][n];
            for(int j = i + 1; j < n; j++) {
                x[i] -= a[i][j] * x[j];
            }
            x[i] /= a[i][i];
        }

        // Output
        for(int i = 0; i < n; i++) {
            printf("%.3f\n", x[i]);
        }
    }
    return 0;
}