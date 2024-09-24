package flightBooking;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AucklandToCoimbatoreSearch {
	
	public static Properties prop;
	
	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException, IOException {
		
		String date = "Fri, Aug 9";
		String month = "August";
		String year = "2024";
		
		prop = new Properties();
		prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("flightUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on Date Picker:
		driver.findElement(By.xpath("(//input[@value])[5]")).click();
		Thread.sleep(3000);
		String currMonth = driver.findElement(By.xpath("(//div[@role='rowgroup']/div)[1]")).getText();
		System.out.println("Current Month showing in calendar is: " +currMonth);
//		if(currMonth.equals(month)) {
//			
//		}
		String priceValueinNZD = driver.findElement(By.xpath("(//span[contains(text(),'NZ$')])[1]")).getText();
		System.out.println(priceValueinNZD);
		
		
	}

}
