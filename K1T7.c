#include <stdio.h>

int main() {
    long long n;
    while(scanf("%lld", &n) == 1) {
        long long k = 1;
        while(k * (k + 1) / 2 < n) k++;
        long long prev = (k - 1) * k / 2;
        long long m = n - prev;
        long long i, j;
        if(k % 2 == 0) {
            // even k: from i=1,j=k to i=k,j=1
            i = m;
            j = k - m + 1;
        } else {
            // odd k: from i=k,j=1 to i=1,j=k
            i = k - m + 1;
            j = m;
        }
        printf("%lld/%lld\n", i, j);
    }
    return 0;
}
