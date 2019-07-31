package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordsChecker_1316 {

	public static void main(String[] args) throws IOException {
		int testCase=0, checker, answer;
		String[] input;
		char[] chr;
		
		boolean[] alphaList = new boolean[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		testCase = Integer.parseInt(br.readLine());
		answer = testCase;
		input = new String[testCase];
		
		for(int i=0; i<testCase; i++) {
			input[i]=br.readLine();
			
		}
		
		for(int i=0; i<testCase; i++) {
			chr = input[i].toCharArray();
			checker = 0;
			
			for(int j=0; j<alphaList.length; j++) {
				alphaList[j]=true;
			}
			
			for(int j=0; j<chr.length; j++) {
				
				if(j==(chr.length-1)) {
					
				} else {
				
					if(alphaList[chr[j]-97] && chr[j]!=chr[j+1]) {
						alphaList[chr[j]-97]=false;
					}
				
					if(alphaList[chr[j+1]-97] == false) {
						checker -= 1;
					}
				
				}
			}
			
			if(checker<0) {
				answer -= 1;
			}
			
		}
		
		System.out.println(answer);
		
	}

}
