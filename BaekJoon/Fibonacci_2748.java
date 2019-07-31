package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci_2748 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		long a,b,c;
		long output = 0;
		int input;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());
		
		a=0;b=1;c=1;
		
		if(input==1 || input==2) {
			output=1;
		} else {
		
			for(int i=0; i<input-2; i++) {
				
				if(a<b && a<c) {
					a=b+c;
					output=a;
				} else if(b<=c && b<a) {
					b=a+c;
					output=b;
				} else {
					c=a+b;
					output=c;
				}
				
			}	
		}
		
		System.out.println(output);
	}
}
