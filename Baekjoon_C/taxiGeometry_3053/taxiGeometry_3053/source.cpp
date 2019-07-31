#include <stdio.h>
#include <iostream>
#define _USE_MATH_DEFINES
#include <math.h>

#define PI 3.14159265359

int main() {
	int input;
	//float pi = 3.14159265359;

	std::cin >> input;

	std::cout.precision(7);
	std::cout<< M_PI*input*input << std::endl;
	std::cout.precision(7);
	std::cout << 2.00000 * input*input << std::endl;

	return 0;
}