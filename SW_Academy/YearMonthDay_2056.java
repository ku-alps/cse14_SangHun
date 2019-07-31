package ALPS.SW_Academy;


import java.util.Scanner;
import java.util.ArrayList;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class YearMonthDay_2056{
 public static void main(String[] args) throws IOException{
     int testCase=0;
     String input;
     int num=0;
     int md, month, day;
     boolean answer;
     String[] list;
          
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
     Scanner scan = new Scanner(System.in);
     testCase = scan.nextInt();
     list = new String[testCase];
     for(int i=0; i<testCase; i++) {
    	 input=br.readLine();
    	 list[i]=input;
     }
     
     for(int a=0; a<testCase; a++){
     answer = true;
     if(list[a]==null)
    	 break;
     num = Integer.parseInt(list[a]);
     char[] chr = (list[a]).toCharArray();
     
     
     md=num%10000;
     month=md/100;
     day=md%100;
     
     if(month==0 || month>13){
         answer=false;
     }
     
     switch(month){
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
             if(day>31 || day==0){
                 answer = false;
             }
             break;
             
         case 4:
         case 6:
         case 9:
         case 11:
             if(day>30 || day==0){
                 answer = false;
             }
             break;
             
         case 2:
             if(day>28 || day==0){   
                 answer = false;
             }
             break;
     }
     
     System.out.print("#" + (a+1) + " ");
     if(answer==false){
         System.out.println("-1\n");
     } else {
         for(int i=0; i<4; i++){
         	System.out.print(chr[i]);
         }
         System.out.print("/");
         for(int i=4; i<6; i++){
        	 System.out.print(chr[i]);
         }
         System.out.print("/");
         for(int i=6; i<8; i++){
        	System.out.print(chr[i]+"\n");
         }
     }
     }
 }
}