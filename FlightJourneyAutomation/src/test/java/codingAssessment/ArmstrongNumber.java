package codingAssessment;

import java.util.ArrayList;
import java.util.List;

//Given a number Ex: 153 the value when multiplied like with cubic value of all the individual numbers should give the same value
//Ex: 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 ==> 153

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		int num = 153;

		//Converting the num as String and storing it in numberString variable
		String numberString = Integer.toString(num);
		//System.out.println(numberString);

		int[] numericValue = new int[numberString.length()];
		
		//Creating an array and storing the digits from numberString
		for(int i = 0; i<numberString.length(); i++) {
			
				numericValue[i] = Character.getNumericValue(numberString.charAt(i));
			
				for(int digit:numericValue) {
					System.out.print(digit + " ");
				}
				
		}
		
		
		

		

	}

}
