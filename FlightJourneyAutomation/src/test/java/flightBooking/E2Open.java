package flightBooking;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2Open {

	public static void main(String[] args) {
		
		WebDriverWait wait;
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
	
		
		//Selecting the Degree dropdown list
		WebElement dropDownElement = driver.findElement(By.id("searchDropdownBox"));
		
		Select degreeDropdown = new Select(dropDownElement);
		
		degreeDropdown.selectByVisibleText("Amazon Devices");
		
		List<WebElement> allSelectedOptions = degreeDropdown.getOptions();
		
		System.out.println(allSelectedOptions.size());

//		for (int i = 0; i < allSelectedOptions.size(); i++) {
//			
//			System.out.println(allSelectedOptions.get(i).getText());
//		}
//		
		
		for (WebElement webElement : allSelectedOptions) {
			
			System.out.println(webElement.getText());
		}
		
	}
	
}
