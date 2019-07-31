package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Assignments_13904 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num;				//the number of assignments. should make array boundary
		int[][] assArray;
		int[] sch;
		int result=0;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		
		assArray = new int[num][2];
		sch = new int[1000];	// this should be able to contain late dead line than the number of ass.
		
		for(int i=0; i<num; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			assArray[i][0] = Integer.parseInt(st.nextToken());
			assArray[i][1] = Integer.parseInt(st.nextToken());
		}
		
		heapSort(assArray);
		
		for(int i=0; i<num; i++) {
			sch[i]=0;
		}
		
		for(int i=num-1; i>=0; i--) {
			int index = assArray[i][0]-1;
			
			while(sch[index] != 0 && index>0) {
				index--;
			}
			
			if(sch[index] == 0 ) {
				sch[index] = assArray[i][1];
				result += sch[index];
			}
		}
		
		System.out.println(result);
	}
	

	public static void heapify(int array[][], int n, int i) {
		int p = i;
		int l = i*2+1;
		int r = i*2+2;
		
		if(l<n && array[p][1]<array[l][1]) {
			p=l;
		}
		
		if(r<n && array[p][1]<array[r][1]) {
			p=r;
		}
		
		if(i != p) {
			swap(array,p,i);
			heapify(array,n,p);
		}
	}
	
	public static void swap(int[][] array, int p, int i) {
		int a=array[p][0];
		int b=array[p][1];
		
		array[p][0]=array[i][0];
		array[p][1]=array[i][1];
		
		array[i][0]=a;
		array[i][1]=b;
	}
	
	public static void heapSort(int[][] array) {
		int n = array.length;
		
		for(int i=n/2-1; i>=0; i--) {
			heapify(array,n,i);
		}
		
		for(int i = n-1; i>0; i--) {
			swap(array,0,i);
			heapify(array, i ,0);
		}
	}

}
