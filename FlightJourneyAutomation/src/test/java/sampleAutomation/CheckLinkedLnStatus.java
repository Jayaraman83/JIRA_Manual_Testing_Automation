package sampleAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLinkedLnStatus {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.linkedin.com/in/balaji-vasudevan-aaa57330/");

		//Checking if the Location is set to New Zealand:
		String currLocation = driver.findElement(By.xpath("//div[@class='not-first-middot']/span")).getText();
		//System.out.println(currLocation);
		
		if(currLocation.contains("New Zealand")) {
			System.out.println("User has set the Location to New Zealand");
		}else
		{
			System.out.println("User has not set the location to New Zealand ");
		}
		driver.quit();
	}	
}
