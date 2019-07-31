#include <stdio.h>
#include <vector>

using namespace std;
int a, b, c;

int main(void) {
	int testCase=0;
	int floor=0, ho=0;
	//vector< vector<int> > apart;
	int apart[15][15] = { 0, };
	vector<int> output;

	scanf_s("%d", &testCase, 1);
	fflush(stdin);


	for (int i = 0; i < 15; i++) {
		apart[0][i] = i;
		apart[i][0] = 0;
	}

	/*for (int i = 0; i < 15; i++) {
		for (int j = 0; j < 15; j++) {
			printf("%d", apart[i][j]);
		}
		printf("\n");
	}*/

	//apart.assign(15, vector<int>(15,0))

	/*for (int i = 0; i < 15; i++) {
		vector<int> floor0;
		floor0.assign();
	}

	for (int i = 0; i < 15; i++) {
		printf("apart : %d\n", &apart[0][i]);
	}*/

	for (int t = 0; t < testCase; t++) {
		scanf_s("%d", &floor, 1);
		fflush(stdin);
		scanf_s("%d", &ho, 1);
		fflush(stdin);

		for (int i = 1; i <= floor; i++) {
			for (int j = 1; j <= ho; j++) {
				apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
			}
		}

		output.push_back(apart[floor][ho]);
	}
	
	/*for (vector<int>::iterator t = output.begin(); t != output.end(); ++t) {
		printf("%d\n", *t);
	}*/

	for (unsigned int i = 0; i < output.size(); i++) {
		printf("%d\n", output[i]);
	}

}