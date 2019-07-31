package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Treasure_1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] input1, input2;
		int[] inputA, inputB;
		int testCase,  result=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		testCase = Integer.parseInt(br.readLine());
		inputA = new int[testCase];
		inputB = new int[testCase];
		input1 = (br.readLine()).split("\\s");
		input2 = (br.readLine()).split("\\s");
		
		
		for(int i=0; i<testCase; i++) {
			inputA[i]=Integer.parseInt(input1[i]);
			inputB[i]=Integer.parseInt(input2[i]);
		}

		
		heapSort(inputA);
		
		for(int i=0; i<(inputA.length/2); i++) {
			int p = inputA[i];
			inputA[i]=inputA[(inputA.length)-1-i];
			inputA[(inputA.length)-1-i]=p;
		}
		
		heapSort(inputB);
		
		
		
		for(int i=0; i<testCase; i++) {
			result = result + inputA[i]*inputB[i];
		}
		
		System.out.println(result);
	}
	
	public static void heapify(int array[], int n, int i) {
		int p = i;
		int l = i*2+1;
		int r = i*2+2;
		
		if(l<n && array[p]<array[l]) {
			p=l;
		}
		
		if(r<n && array[p]<array[r]) {
			p=r;
		}
		
		if(i != p) {
			swap(array,p,i);
			heapify(array,n,p);
		}
	}
	
	public static void swap(int[] array, int p, int i) {
		int a=array[p];
		array[p]=array[i];
		array[i]=a;
	}
	
	public static void heapSort(int[] array) {
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
