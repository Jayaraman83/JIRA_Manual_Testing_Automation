package codingAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayCalculator {
	
	private static final List<String> daysOfWeek = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
	
	public static String findDay(String startDay, int n) {
		int startIndex = daysOfWeek.indexOf(startDay);

		if (startIndex == -1) {
	        throw new IllegalArgumentException("Invalid start day: " + startDay);
	    }

	    int targetIndex = (startIndex + n) % daysOfWeek.size();
	    return daysOfWeek.get(targetIndex);
	}
	    
	public static void main(String[] args) {
	    String startDay = "Mon";
	    int n = 5;

	    String result = findDay(startDay, n);
	    System.out.println("The " + n + "th day from " + startDay + " is " + result + ".");
	}	
}
