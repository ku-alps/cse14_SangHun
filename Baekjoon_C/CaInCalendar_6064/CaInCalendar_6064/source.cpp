#include <stdio.h>
#include <vector>

using namespace std;

int gcd(int a, int b) {
	while (b > 0) {
		int temp = b;
		b = a%b;
		a = temp;
	}
	return a;
}

int lcm(int a, int b) {
	return a*b / gcd(a, b);
}

int main(void) {
	int testCase = 0;
	int m = 0, n = 0, x = 0, y = 0;
	int bigger, small, biggerNum, smallNum;
	int index=0;
	bool result;
	int mnLcm;
	int repeat;

	scanf_s("%d", &testCase,1);
	fflush(stdin);

	for (int t = 0; t < testCase; t++) {
		result = false;

		scanf_s("%d", &m,1);
		fflush(stdin);
		scanf_s("%d", &n,1);
		fflush(stdin);
		scanf_s("%d", &x,1);
		fflush(stdin);
		scanf_s("%d", &y,1);
		fflush(stdin);

		if (m>n) {
			bigger = m;
			small = n;
			biggerNum = x;
			smallNum = y;
		}
		else {
			bigger = n;
			small = m;
			biggerNum = y;
			smallNum = x;
		}

		//printf("m : %d / n : %d / bigger : %d / small : %d\n");
		mnLcm = lcm(bigger, small);
		//repeat = mnLcm / small;
		//repeatIndex = (m*n) / (mnGcd*mnGcd);
		//printf("GCD : %d\n", mnGcd);
		//printf("repeat Index : %d\n",repeatIndex);

		for (int i = 0; i < mnLcm/small; i++) {
			index = i*bigger + biggerNum;

			if (index % small == smallNum) {
				result = true;
				break;
			}
			else if (index % small == 0 && small == smallNum) {
				result = true;
				break;
			}
		}

		if (result) {
			printf("%d\n", index);
		}
		else {
			printf("-1\n");
		}
	}
}