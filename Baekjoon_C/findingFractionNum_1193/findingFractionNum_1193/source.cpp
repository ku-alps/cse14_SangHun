#include<stdio.h>
#include<iostream>

int main() {
	int input,index, num;
	int left, right;

	scanf_s("%d", &input, 1);
	fflush(stdin);
	index = 1;
	left = 1, right = 1;

	while ((index*index + index)/2 < input) {
		index++;
	}

	num = (index*index + index) / 2;
	if (index % 2) {
		right = index;
		while (num != input) {
			left++;
			right--;
			num--;
		}
	}
	else {
		left = index;
		while (num != input) {
			left--;
			right++;
			num--;
		}
	}

	printf("%d/%d\n", left, right);
}