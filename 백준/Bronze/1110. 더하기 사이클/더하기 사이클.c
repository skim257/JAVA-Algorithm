#include <stdio.h>

int main() {
    int n, original_n, new_n, count = 0;

    scanf("%d", &n);
    original_n = n;

    do {
        int tens = n / 10;
        int ones = n % 10;
        int sum = tens + ones;
        new_n = (ones * 10) + (sum % 10);
        n = new_n;
        count++;
    } while (n != original_n);

    printf("%d\n", count);

    return 0;
}