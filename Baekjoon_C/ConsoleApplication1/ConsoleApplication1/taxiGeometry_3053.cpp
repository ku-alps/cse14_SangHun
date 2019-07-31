#include <stdio.h>
#include <iostream>

int main() {

	int testCase = 0;
	int num, flag;
	int result = 0;

	std::cin >> testCase;

	for (int i = 0; i < testCase; i++) {
		std::cin >> num;
		flag = 0;

		if (num == 1) {
			flag--;
		}

		for (int j = 2; j <= num / 2; j++) {
			if (num%j == 0) {
				flag--;
				break;
			}
		}

		if (flag == 0) {
			result++;
		}
	}

	std::cout << result << std::endl;

	return 0;
}