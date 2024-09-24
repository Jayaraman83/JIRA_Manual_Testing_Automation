package codingAssessment;

import java.util.Scanner;

public class FindingFactorial2 {

	//If given value as 5 it should calculate 5*4*3*2*1 and print the output
	
	public static int findFactorial(int num) {

		long factorial = 1;
		
		for(int i=1; i<=num; i++) {
			if(num==0) {
				System.out.println("Please input a valid integer");
			}
			factorial *= i;
			
		}
		System.out.println("Factorial of the Given number " + num + " is : " +factorial);
		return num;
	}
	
	public static void main(String[] args) {
		
		FindingFactorial2 ff = new FindingFactorial2();
		ff.findFactorial(5);
		
	}
}