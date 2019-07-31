#include <stdio.h>
#include <iostream>

int main(void) {
	int testCase;
	int floor, room, guest, result;

	scanf_s("%d", &testCase,1);
	fflush(stdin);

	for (int i = 0; i < testCase; i++) {
		scanf_s("%d", &floor, 1);
		fflush(stdin);
		scanf_s("%d", &room, 1);
		fflush(stdin);
		scanf_s("%d", &guest, 1);
		fflush(stdin);
		result = 1;

		while (guest) {
			result += 100;
			if (result>(floor+1)*100) {
				result -= floor * 100;
				result++;
			}
			guest--;
		}

		printf("%d\n", result);
	}
}