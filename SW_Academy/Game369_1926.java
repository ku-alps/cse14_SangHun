package ALPS.SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Game369_1926 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int input;
		String[] num;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = Integer.parseInt(br.readLine());
		num = new String[input+1];
		
		for(int i=0; i<=input; i++) {
			num[i]="";
		}
		
		for(int i=1; i<=input; i++) {
			String strNum = Integer.toString(i);
			for(int j=0; j<strNum.length(); j++) {
				if(strNum.charAt(j)=='3' || strNum.charAt(j)=='6' || strNum.charAt(j)=='9') {
					num[i] += "-";
				}
			}
		}
		
		
		for(int i=1; i<=input; i++) {
			if(num[i].isEmpty()) {
				System.out.print(i+" ");
			} else {
				for(int j=0; j<num[i].length(); j++) {
					System.out.print(num[i].charAt(j));
				}
				System.out.print(" ");
			}
		}
	}
}
