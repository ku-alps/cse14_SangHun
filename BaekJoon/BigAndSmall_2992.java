package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigAndSmall_2992 {

	public static void main(String[] args) throws IOException {
		String input;
		int n0,n1,n2,n3,n4,n5, num;
		int[] number = new int[6];
		int[] composeNum;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		st = new StringTokenizer(input);
		
		num = Integer.parseInt(input);
		n0 = num%10;
		n1 = (num%100-n0)/10;
		n2 = (num%1000-n0-n1*10)/100;
		n3 = (num%10000-n0-n1*10-n2*100)/1000;
		n4 = (num%100000-n0-n1*10-n2*100-n3*1000)/10000;
		n5 = (num%1000000-n0-n1*10-n2*100-n3*1000-n4*10000)/100000;
		
		number[5]=n5;
		number[4]=n4;
		number[3]=n3;
		number[2]=n2;
		number[1]=n1;
		number[0]=n0;
		
		/*if(n5==0) {
			n5=-1;
			if(n4==0) {
				n4=-1;
				if(n3==0) {
					n3=-1;
					if(n2==0) {
						n2=-1;
						if(n1==0) {
							
						}
					}
				}
			}
		}*/
		
		
		heapSort(number);
		
		
		/*number = new int[st.countTokens()];*/
		
		for(int i=0; i<number.length; i++) {
			
		}
		
		
		
		//heapSort(number);
		
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
