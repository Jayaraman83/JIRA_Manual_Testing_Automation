package codingAssessment;

import java.util.Scanner;

public class FindingFactorial {

	//If given value as 5 it should calculate 5*4*3*2*1 and print the output
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		long factorial = 1;
		
		for(int i=1; i<=num; i++) {
			
			factorial *= i;
			
		}
		System.out.println("Factorial of the Given number " + num + " is : " +factorial);
	}
}