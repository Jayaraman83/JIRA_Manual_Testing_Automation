package flightBooking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SingaporeAirLineTest {

	
	@Test
	public void loginToSingaporeAirline() throws FileNotFoundException, IOException{
		
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("src/test/resources/config.properties")));
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(prop.getProperty("flightUrl"));
		
		driver.findElement(By.xpath("//div[@class='dwc--SiaHeader__NavLogin']/div/a")).click();
		
		//driver.findElement(By.partialLinkText("Log-in")).click();
		

		
		
		
	}
	
}
