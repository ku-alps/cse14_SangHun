package ALPS.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Checker{
	boolean result = true;
	char[] num;
	//String num;
	int index=0;
	int indexZ=0;
	
	Checker(String num) {
		this.num = num.toCharArray();
		//this.num=num;
	}
	
	void check01() {
		if((index+1)<num.length) {
			if(num[index]=='0' && num[index+1]=='1') {
				if((index+2)==num.length) {
					result=true;
					printResult();
				} else {
					index += 2;
					check01();
				}
			} else {
				check1001();
			}
		} else {
			result = false;
			printResult();
		}
	}
	
	
	void check1001() {
		if((index+3)<num.length) {
			if(num[index]=='1' && num[index+1]=='0' && num[index+2]=='0') {
				index += 2;
				while((index+1)<num.length) {
					index += 1;
					if(num[index]=='1') {
						result=true;
						break;
					}
					result=false;
				}
				
				while((index+1)<num.length) {
					index += 1;
					if(num[index]=='0') {
						break;
					}
				}
				
				if((index+1) == num.length) {
					printResult();
				} else {
					if(num[index+1]=='1') {
						check01();
					} else {
						if(num[index-2]=='1') {
							index -= 1;
							check1001();
						} else {
							result = false;
							printResult();
						}
					}
				}
				
			} else {
				result = false;
				printResult();
			}
		} else {
			result = false;
			printResult();
		}
	}
	
	
	void printResult() {
		if(result){
			System.out.println("SUBMARINE");
		} else {
			System.out.println("NOISE");
		}
	}
}


public class Submarine_2671 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String input;
		
		Checker chk;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		
		
		chk = new Checker(input);
		chk.check01();
	}
}
