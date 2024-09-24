package sampleAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndoCheck {

	
	public static void main(String[] args) {
	
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://careers.ando.co.nz/jobs");
		
		String jobCount = driver.findElement(By.xpath("//span[@class='text-lg font-medium']")).getText();
		
		if(jobCount.equals("5 jobs")) {
			
			System.out.println("No new Jobs Added");
		}else
			{
			System.out.println("Check out the new Jobs added!!!!");
			}
		
	}

}
