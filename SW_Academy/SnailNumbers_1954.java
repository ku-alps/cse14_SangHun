package ALPS.SW_Academy;

import java.util.Scanner;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class NumWriter{
	int num; 
	int i, j, testCase, arraySize;
	int[][] arr;
	
	NumWriter(int testCase, int aS){
		i=0; j=0; num=1;
		this.testCase = testCase;
		this.arraySize = aS;
		arr = new int[arraySize][arraySize];
		
		for(int i=0; i<arraySize; i++) {
			for(int j=0; j<arraySize; j++) {
				arr[i][j]=0;
			}
		}
	}
	
	void hr(){
        while(i<arraySize){
            if((arr[i][j])==0){
                arr[i][j]=num;
                num++;
                i++;
            } else {
             break;   
            }
        }
        i-=1;
        
        if(arr[i][j+1]==0){
        	j+=1;
        	vd();
        }else{
            printArr();
        }
    }
    
    void hl(){
        while(i>=0){
            if(arr[i][j] == 0){
                arr[i][j]=num;
                num++;
                i--;
            } else {
             break;   
            }
        }
        i+=1;
        
         if(arr[i][j-1]==0){
        	 j-=1;
        	 vu();
        }else{
            printArr();
        }
    }
    
    void vd(){
        while(j<arraySize){
            if(arr[i][j] == 0){
                arr[i][j]=num;
                num++;
                j++;
            } else {
             break;   
            }
        }
        j-=1;
        i-=1;
        hl();
    }
    
   void vu(){
        while(j>=0){
            if(arr[i][j] == 0){
                arr[i][j]=num;
                num++;
                j--;
            } else {
             break;   
            }
        }
        j+=1;
        i+=1;
        hr();   
    }
    
    void printArr(){
    	System.out.println("");
    	System.out.println("#"+testCase);
        for(int i=0; i<arraySize; i++){
            for(int j=0; j<arraySize; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }
    }
}




public class SnailNumbers_1954{
    public static void main(String[] args) throws IOException{
    	int testCase;
        int arraySize;
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        testCase = Integer.parseInt(br.readLine());
        
        for(int i=0; i<testCase; i++) {
        	arraySize=Integer.parseInt(br.readLine());
        	NumWriter nw = new NumWriter(i+1, arraySize);
        	nw.hr();
        }
       
    }
}
