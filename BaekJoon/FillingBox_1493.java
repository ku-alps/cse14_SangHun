package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class FillingBox_1493 {

	public static void main(String[] args) throws IOException {
		String input;
		int length, width, height, shortest, biggestBox;
		int boxNum;
		int result;
		int[][] boxArray;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		input = br.readLine();
		st = new StringTokenizer(input);
		length = Integer.parseInt(st.nextToken());
		width = Integer.parseInt(st.nextToken());
		height = Integer.parseInt(st.nextToken());
		
		boxNum = Integer.parseInt(br.readLine());
		boxArray = new int[boxNum][2];
		
		for(int i=0; i<boxNum; i++) {
			input = br.readLine();
			st = new StringTokenizer(input);
			boxArray[i][0] = Integer.parseInt(st.nextToken());
			boxArray[i][1] = Integer.parseInt(st.nextToken());
		}
		
		if(length<=width && length<=height) {
			shortest = length;
		} else if(height<=width && height<=length) {
			shortest = height;
		} else {
			shortest = width;
		}
		
		heapSort(boxArray);
		
		for(int i=0; i<boxNum; i++) {
			if(Math.pow(2, boxArray[i][0])>shortest && i>0) {
				biggestBox = boxArray[i-1][0];
				break;
			} else if(Math.pow(2, boxArray[i][0])>shortest && i==0) {
				result=-1;
				break;
			}
		}
		
	}
	
	
	public static void heapify(int array[][], int n, int i) {
		int p = i;
		int l = i*2+1;
		int r = i*2+2;
		
		if(l<n && array[p][0]<array[l][0]) {
			p=l;
		}
		
		if(r<n && array[p][0]<array[r][0]) {
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
