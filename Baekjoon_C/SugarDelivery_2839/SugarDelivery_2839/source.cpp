#include<stdio.h>
#include<iostream>

int main() {
	int input, remain, result;

	scanf_s("%d", &input,1);
	fflush(stdin);
	remain = 0;
	
	while (true) {
		if (input % 5 == 0) {
			if (remain % 3 == 0) {
				result = input / 5 + remain / 3;
				break;
			}
			else if(input == 0){
				result = -1;
				break;
			}
		}
		input--;
		remain++;
	}

	printf("%d\n",result);
}