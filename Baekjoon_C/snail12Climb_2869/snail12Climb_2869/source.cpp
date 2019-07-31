#include <stdio.h>
#include <iostream>

int main(void) {
	int counter = 0;
	int a, b, v, height;

	scanf_s("%d", &a, 1);
	fflush(stdin);
	scanf_s("%d", &b, 1);
	fflush(stdin);
	scanf_s("%d", &v, 1);
	fflush(stdin);

	(v - b) % (a - b) == 0 ? (counter = (v - b) / (a - b)) : (counter = (v - b) / (a - b) + 1);

	printf("%d\n",counter);
}