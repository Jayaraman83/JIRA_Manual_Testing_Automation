package flightBooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TricentisAutomation {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tricentis.com/software-testing-tool-trial-demo/tosca-mobile-demo?utm_source=google&utm_medium=paidsearch&utm_campaign=ToscaMobile_Search_Nonbrand_High_APAC_EN&utm_term=mobile%20app%20automation%20testing&gad_source=1&gclid=CjwKCAjw1920BhA3EiwAJT3lSfdGvv6iI8PE2onO7uqwZuqHFPZk5NKsS8C13PD43GvLCyLtukBjdxoCFQkQAvD_BwE");
		
		WebElement countryDd = driver.findElement(By.id("Country"));
		
		Select dd = new Select(countryDd);

		List<WebElement> countryList = dd.getOptions();
		
		System.out.println(countryList.size());
		
		for (WebElement webElement : countryList) {
			System.out.println(webElement.getText());
		}
		
	}
	
}
