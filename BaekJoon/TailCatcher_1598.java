package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class TailCatcher_1598 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int inputA, inputB;
		String input;
		int vert, hori;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		input = br.readLine();
		st = new StringTokenizer(input);
		inputA = Integer.parseInt(st.nextToken());
		inputB = Integer.parseInt(st.nextToken());
		
		
		if((inputA-1)%4 > (inputB-1)%4) {
			vert = (inputA-1)%4 - (inputB-1)%4;
		} else {
			vert = (inputB-1)%4 - (inputA-1)%4;
		}
		
		if((inputA-1)/4 > (inputB-1)/4) {
			hori = (inputA-1)/4 - (inputB-1)/4;
		} else {
			hori = (inputB-1)/4 - (inputA-1)/4;
		}
		
		System.out.println(vert+hori);	
	}
}
