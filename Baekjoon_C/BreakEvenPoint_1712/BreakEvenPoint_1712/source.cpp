#include<stdio.h>
#include<iostream>
#include<cmath>

int main() {
	double a, b, c;
	double result;

	scanf_s("%lf",&a,1);
	fflush(stdin);
	scanf_s("%lf", &b, 1);
	fflush(stdin);
	scanf_s("%lf", &c, 1);
	fflush(stdin);

	if (c>b) {
		result = ceil(a / (c - b));
	}
	else {
		printf("-1\n");
		return 0;
	}

	(result != a / (c - b)) ? printf("%d\n", (int)result) : printf("%d\n", (int)result + 1);
}