package flightBooking;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LearnArrays {

	public static int numbers[] = {91,82,103,44,504};
	public static String names[] = {"jay","krish","Alvin"};
	
	@Test
	public void simplaArray() {

		System.out.println(numbers[0]);
		System.out.println(names[2]);
		
		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
			
		}
		
		for (int j = 0; j < names.length; j++) {
			
			System.out.println(names[j]);
		}
		
		Arrays.sort(numbers);
		
	}
	
	@Test(priority=1)
	public void dynamicArray() {
		
		String[][] passengerNames = new String[2][2];
		
		passengerNames[0][0] = "Jayaraman B";
		passengerNames[0][1] = "Sangamithra K";
		passengerNames[1][0] = "Ishan J";
		passengerNames[1][1] = "Vedanth J";
			
		for (int i = 0; i < passengerNames.length; i++) {
			
			for(int j = 0; j < passengerNames.length; j++) {
				
				System.out.println(passengerNames[i][j]);

				
			}
			
		}
		
	}
	
}
