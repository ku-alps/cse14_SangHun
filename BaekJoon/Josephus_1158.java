package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Josephus_1158 {

	public static void main(String[] args) throws IOException {
		String input;
		int number, kill, count, numberIndex;
		int[] array, result;
		boolean[] checker;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		st = new StringTokenizer(input);
		number = Integer.parseInt(st.nextToken());
		kill = Integer.parseInt(st.nextToken());
		array = new int[number];
		checker = new boolean[number];
		result = new int[number];
		count = 0;
		numberIndex = 0;
		int j = 0;
		
		for(int i=0; i<number; i++) {
			array[i]=i+1;
			checker[i] = true;
		}
		
		/*while(count<number) {
			if(checker[kill]==false) {
				kill++;
			}
			
			if(kill>number) {
				kill-=number;
			}
			
			result[count]=array[kill];
			checker[kill]=false;
			kill += kill;
			count++;
		}*/
		
		result[count] = array[kill-1];
		checker[kill-1]=false;
		count++;
		numberIndex=kill-1;
		
		while(count<number) {
			do {
				
				if(numberIndex==number) {
					numberIndex -= (number);
				}
				
				j++;
				
				if(checker[numberIndex]==false) {
					j--;
				}
				
				numberIndex++;
				
			}  while(j<kill);
			
			numberIndex--;
			result[count] = array[numberIndex];
			checker[numberIndex]=false;
			count++;
		}
		
		System.out.print("<");
		for(int i=0; i<number; i++) {
			if(i == number-1) {
				System.out.print(result[i]+">");
			} else {
				System.out.print(result[i]+", ");
			}
		}
		
	}
	
	
	/*static int arrayChecker(int[] a, boolean[] b, int index, int kill) {
		int len = a.length;
		
		
		
		return 0;
	}*/

}
