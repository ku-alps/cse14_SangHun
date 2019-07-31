package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Climbing_2846 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int length;
		String input;
		StringTokenizer st;
		int[] array;
		int Max1, Max2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		length = Integer.parseInt(br.readLine());
		array = new int[length];
		input = br.readLine();
		st = new StringTokenizer(input);
		Max1=0;
		
		for(int i=0; i<length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<length; i++) {
			
			if(i+1 < array.length) {				// array bound check
				if(array[i]<array[i+1]) {			// 
					Max2=arraySearch(array,i);
					if(Max2>Max1) {
						Max1=Max2;
					}
				}
			}
		}
		
		System.out.println(Max1);
	}
	
	
	public static int arraySearch(int[] array, int i) {
		int index = i;
		int b=0;
		int max=0;
		int a=array[i];
		
		while(true) {
			if(index+1 < array.length) {			// array bound check
				if(array[index]<array[index+1]) {
					b=array[index+1];
					index++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		max = b-a;
		
		return max;
	}
}
