#include<stdio.h>
#include<iostream>
#include<cmath>

int main(void) {
	int testCase;
	int x, y,dist;
	int index;
	float sqrtDist;
	int result;
		
	scanf_s("%d", &testCase,1);
	fflush(stdin);

	for (int i = 0; i < testCase; i++) {
		scanf_s("%d", &x,1);
		fflush(stdin);
		scanf_s("%d", &y,1);
		fflush(stdin);
		dist = y - x;
		result = 0;
		sqrtDist = sqrt(dist);
		index = ceil(sqrtDist);
		//printf("%f\n", sqrt(dist));
		//printf("%d\n", index);

		(index*index - index) < dist ? result = 2 * index - 1 : result = 2 * index - 2;
		
		printf("%d\n",result);
	}
}