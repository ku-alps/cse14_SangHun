#include<stdio.h>
#include<iostream>
#include<cmath>

int main() {
	int testCase;
	int x1, y1, r1, x2, y2, r2, result;
	int rc, rl, rr;

	scanf_s("%d", &testCase, 1);
	fflush(stdin);

	for (int i = 0; i < testCase; i++) {

		scanf_s("%d", &x1, 1);
		fflush(stdin);
		scanf_s("%d", &y1, 1);
		fflush(stdin);
		scanf_s("%d", &r1, 1);
		fflush(stdin);
		scanf_s("%d", &x2, 1);
		fflush(stdin);
		scanf_s("%d", &y2, 1);
		fflush(stdin);
		scanf_s("%d", &r2, 1);
		fflush(stdin);

		rc = pow(x1 - x2, 2) + pow(y1 - y2, 2);

		if (rc > r1*r1 && rc > r2*r2) {
			rl = rc, rr = pow(r1 + r2, 2);
		}
		else {
			(r1 > r2) ? rl = pow(r1 - r2, 2) : rl = pow(r2 - r1, 2);
			rr = rc;
		}

		if (rl > rr) {
			result = 0;
		}
		else if (rl == rr) {
			if (rl) {
				result = 1;
			}
			else {
				result = -1;
			}
		}
		else {
			result = 2;
		}

		printf("%d\n", result);
	}
}