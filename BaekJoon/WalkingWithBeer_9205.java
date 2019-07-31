package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WalkingWithBeer_9205 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int testCase;
		int spotNum;
		String input;
		int[][] spot;
		boolean[][] spotNet;
		int[] path;
		boolean findEnd;
		int pathfinder;
		//int pathCounter;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		testCase = Integer.parseInt(br.readLine());
		
		for(int t=0; t<testCase; t++) {
			spotNum = Integer.parseInt(br.readLine());
			spot = new int[spotNum+2][2];
			spotNet = new boolean[spotNum+2][spotNum+2];
			path = new int[spotNum+2];
			pathfinder = 0;
			findEnd=false;
			
			for(int i=0; i<spotNum+2; i++) {
				path[i]=0;
				input = br.readLine();
				st = new StringTokenizer(input);
				spot[i][0] = Integer.parseInt(st.nextToken());
				spot[i][1] = Integer.parseInt(st.nextToken());
			}
			
			for(int a=0; a<spotNum+1; a++) {
				for(int b=a+1; b<spotNum+2; b++) {
					if((spot[a][0]-spot[b][0])*(spot[a][0]-spot[b][0])+(spot[a][1]-spot[b][1])*(spot[a][1]-spot[b][1])>1000000) {
						spotNet[a][b]=false;
					} else {
						spotNet[a][b]=true;
					}
				}
			}
			
			boolean chk=true;
			searching: for(; pathfinder<spotNum+1; pathfinder++) {
				
				while(chk) {
				for(int j=pathfinder+1; j<spotNum+2; j++) {
					if(spotNet[pathfinder][j]) {
						if(j==spotNum+1) {
							findEnd=true;
							break searching;
						}
						path[pathfinder] = j;
						pathfinder = j;
						break;
						
					} else if(j==spotNum+1 && spotNet[pathfinder][j]==false) {
						chk=false;
					}
				}
				
				}
				
				do {
					pathfinder--;
					if(pathfinder<0) {
						break searching;
					}
				} while(path[pathfinder]==0);
				
				
				path[pathfinder] += 1;
				
			}
			
			if(findEnd) {
				System.out.println("happy");
			} else {
				System.out.println("sad");
			}
			
		}
	}
}
