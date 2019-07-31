#include <stdio.h>
#include <iostream>

int main(void) {
	int numberofCards, blackJackNum;
	int cardNum;
	int result=0;

	std::cin >> numberofCards >> blackJackNum;
	
	int *card = new int[numberofCards];

	for (int i = 0; i < numberofCards; i++) {
		std::cin >> card[i];
	}

	for (int i = 0; i < numberofCards - 2; i++) {
		for (int j = i+1; j < numberofCards - 1; j++) {
			for (int k = j+1; k < numberofCards; k++) {
				if ((card[i]+card[j]+card[k])==blackJackNum) {
					std::cout << blackJackNum;
					return 0;
				} else if((card[i] + card[j] + card[k])<blackJackNum){
					if (blackJackNum - (card[i] + card[j] + card[k]) < blackJackNum - result) {
						result = card[i] + card[j] + card[k];
					}
				}
			}
		}
	}

	std::cout << result << std::endl;

	return 0; 
}