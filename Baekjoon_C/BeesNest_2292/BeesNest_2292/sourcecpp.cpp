#include<stdio.h>
#include<iostream>
#include<cmath>

int main() {
	int result;
	double input, num;

	scanf_s("%lf", &input, 1);
	fflush(stdin);

	num = sqrt((input - 1) / 3);
	result = roundf(num)+1;
	printf("%d\n",result);
}