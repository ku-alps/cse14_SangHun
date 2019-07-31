#include <stdio.h>
#include <iostream>

int main() {
	int input = 0;
	int num = 0;
	int a, b, c, d, e, f, g;
	std::cin >> input;

	if (input < 100) {
		for (int a = 0; a < 9; a++) {
			for (int b = 0; b < 9; b++) {
				if (11*a + 2*b == input) {
					std::cout << 10 * a + b;
					return 0;
				}
			}
		}
	}

	if (input >= 100 && input < 1000) {
		for (int i = 90; i < input; i++) {
			num = i;
			a = num % 10;
			num = num / 10;
			b = num % 10;
			num = num / 10;
			c = num % 10;

			if (2 * a + 11 * b + 101 * c == input) {
				std::cout << i;
				return 0;
			}
		}
	}
	else if (input >= 1000 && input < 10000) {
		for (int i = 900; i < input; i++) {
			num = i;
			a = num % 10;
			num = num / 10;
			b = num % 10;
			num = num / 10;
			c = num % 10;
			num = num / 10;
			d = num % 10;

			if (2 * a + 11 * b + 101 * c + 1001 * d == input) {
				std::cout << i;
				return 0;
			}
		}
	}
	else if (input >= 10000 && input < 100000) {
		for (int i = 9000; i < input; i++) {
			num = i;
			a = num % 10;
			num = num / 10;
			b = num % 10;
			num = num / 10;
			c = num % 10;
			num = num / 10;
			d = num % 10;
			num = num / 10;
			e = num % 10;

			if (2 * a + 11 * b + 101 * c + 1001 * d + 10001 * e == input) {
				std::cout << i;
				return 0;
			}
		}
	}
	else if (input >= 100000 && input < 1000000) {
		for (int i = 90000; i < input; i++) {
			num = i;
			a = num % 10;
			num = num / 10;
			b = num % 10;
			num = num / 10;
			c = num % 10;
			num = num / 10;
			d = num % 10;
			num = num / 10;
			e = num % 10;
			num = num / 10;
			f = num % 10;

			if (2 * a + 11 * b + 101 * c + 1001 * d + 10001 * e + 100001 * f == input) {
				std::cout << i;
				return 0;
			}
		}
	}
	else {
		for (int i = 900000; i < input; i++) {
			num = i;
			a = num % 10;
			num = num / 10;
			b = num % 10;
			num = num / 10;
			c = num % 10;
			num = num / 10;
			d = num % 10;
			num = num / 10;
			e = num % 10;
			num = num / 10;
			f = num % 10;
			num = num / 10;
			g = num % 10;

			if (2 * a + 11 * b + 101 * c + 1001 * d + 10001 * e + 100001 * f + 1000001 * g == input) {
				std::cout << i;
				return 0;
			}
		}
	}

	std::cout << 0;
	return 0;
}


/*
int n, i, j, cnt, sum;

int main() {
scanf("%d", &n);
i = n;
while (i) i /= 10, cnt++;
for (i = n - 9 * cnt; i < n; i++) {
sum = i;
for (j = i; j; j /= 10) sum += j % 10;
if (sum == n) break;
}
printf("%d", i != n ? i : 0);
return 0;
}
*/