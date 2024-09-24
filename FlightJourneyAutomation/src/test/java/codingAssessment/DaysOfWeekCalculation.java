package codingAssessment;

import java.util.Scanner;

public class DaysOfWeekCalculation {

	public void daysOfWeek(String S, int K) {
		
		String daysofWeek[] = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	
		
		for(int i = 0; i<daysofWeek.length; i++) {
			
			if((daysofWeek[i].equals(S) && (K>=0 && K<=500)))
			{
				System.out.println("Next "+ K +"st or th "+" Day from the Given Day is: "+daysofWeek[i+K]);
			}
			else if(!daysofWeek[i].equals(S) && (K<0 || K>500))
				{
					System.out.println("Entered input is not valid!!!");
				}
				
		}
		
	}

	public static void main(String[] args) {
		DaysOfWeekCalculation dow = new DaysOfWeekCalculation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day:");
		String inputS = sc.next();
		System.out.println("Enter the No of days from the Day to Print: ");
		int inputK = sc.nextInt();
		dow.daysOfWeek(inputS,inputK);
		
		
	}

}
