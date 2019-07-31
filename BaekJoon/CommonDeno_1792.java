package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;


public class CommonDeno_1792 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int testCase;
		int a,b,d;
		String input;
		int[] aArray, bArray;
		//System.out.println(2%4);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		testCase = Integer.parseInt(br.readLine());
		
		for(int k=0; k<testCase; k++) {
			input=br.readLine();
			st = new StringTokenizer(input);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			
			aArray = new int[a+1];
			bArray = new int[b+1];
			
			
			for(int n=0; n*d<=a; n++) {
				aArray[n]=n;
				
			}
			
			for(int m=0; m*d<=b; m++) {	
				bArray[m]=m;
			}
			
			int count=0;
			
			for(int i : aArray) {
				for(int j : bArray) {
					if(i*j != 0) {
						if(i==1 || j==1) {
							count++;
						} else if(i%j!=0 && j%i!=0) {
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
			
		}
	}
}