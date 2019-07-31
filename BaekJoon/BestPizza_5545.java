package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BestPizza_5545 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st;
		int[] topArray;
		int topNum, doughPrice, topPrice, doughCal;
		double result=0;
		int resultI;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		topNum = Integer.parseInt(br.readLine());
		
		topArray = new int[topNum];
		
		st = new StringTokenizer(br.readLine());
		doughPrice = Integer.parseInt(st.nextToken());
		topPrice = Integer.parseInt(st.nextToken());
		doughCal = Integer.parseInt(br.readLine());
		int totalCal=doughCal;
		int totalPrice=doughPrice;
		
		for(int i=0; i<topNum; i++) {
			topArray[i] = Integer.parseInt(br.readLine());
		}
		
		//heapSort(topArray);
		Arrays.sort(topArray);
		
		/*for(int i=0; i<topNum; i++) {
			System.out.println(topArray[i]);
		}*/
		
		for(int i=topArray.length-1; i>=0; i--) {
			totalCal += topArray[i];
			totalPrice += topPrice;
			
			if(totalCal/totalPrice > result || i==topArray.length-1) {
				result = totalCal/totalPrice;
			} else {
				//break;
			}
			
		}
		
		resultI=(int) result;
		System.out.println(resultI);
	}
}
	/*
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
*/