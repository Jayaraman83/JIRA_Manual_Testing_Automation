package codingAssessment;

import java.util.Scanner;

public class StringFunction {
	
	String str;
	
	public void lengthOfString(){

		Scanner scan = new Scanner(System.in);
		System.out.print("Input the String : ");
		str = scan.next();
		
		int length = str.length();
		System.out.println("Length of the input string "+str+" is : " +length);
		
	}
	
	public void stringEmptyCheck() {
		
		if(str.isEmpty()) {
			System.out.println("Length of the input String is Empty!!!");
		}
		else {
			System.out.println("Length of the input String is Not Empty");
		}
	}
	

	public static void main(String[] args) {

		StringFunction sf = new StringFunction();
		sf.lengthOfString();
		sf.stringEmptyCheck();
		
	}

}
