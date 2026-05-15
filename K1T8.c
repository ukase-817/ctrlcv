#include <stdio.h>
#include <stdlib.h>

// 求最大公约数（欧几里得算法）
long long gcd(long long a, long long b) {
    a = llabs(a);
    b = llabs(b);
    while (b) {
        long long t = b;
        b = a % b;
        a = t;
    }
    return a;
}

// 约分分数，并保证分母为正
void reduce(long long *num, long long *den) {
    long long g = gcd(*num, *den);
    *num /= g;
    *den /= g;
    if (*den < 0) {
        *num = -*num;
        *den = -*den;
    }
}

int main() {
    int N;
    while (scanf("%d", &N) == 1) {
        long long sum_num = 0, sum_den = 1;  // 初始和为 0/1

        for (int i = 0; i < N; ++i) {
            long long a, b;
            scanf("%lld/%lld", &a, &b);

            // 化简输入的分数
            reduce(&a, &b);

            // 累加： sum = sum + a/b = (sum_num * b + a * sum_den) / (sum_den * b)
            long long new_num = sum_num * b + a * sum_den;
            long long new_den = sum_den * b;

            // 化简新分数
            reduce(&new_num, &new_den);

            sum_num = new_num;
            sum_den = new_den;
        }

        // 输出最终结果
        if (sum_num == 0) {
            printf("0\n");
            continue;
        }

        long long integer = sum_num / sum_den;        // 整数部分（向零取整）
        long long remainder = sum_num % sum_den;      // 余数（可能为负）

        if (integer != 0) {
            if (remainder == 0) {
                printf("%lld\n", integer);
            } else {
                // 分数部分取绝对值，保证为正
                printf("%lld %lld/%lld\n", integer, llabs(remainder), sum_den);
            }
        } else {
            // 整数部分为0，直接输出分数
            printf("%lld/%lld\n", sum_num, sum_den);
        }
    }
    return 0;
}