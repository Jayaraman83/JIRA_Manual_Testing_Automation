package flightBooking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tyres {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tyresnmore.com/all/car-tyres/honda/city-2014-2019/s-sv-v.html");
		
		List<WebElement> tyres = driver.findElements(By.xpath("(//a[@class='product-item-link']//parent::div)/a"));
		List<WebElement> tyreAmounts = driver.findElements(By.xpath("(//a[@class='product-item-link']//parent::div)//parent::div//child::div/div[@class ='amount_qty']/span/span/following-sibling::span"));
		List<WebElement> noOfPurchases = driver.findElements(By.xpath("//div[@class='custom-bottom']/div/div[2]/span/img"));
		
		int noOfTyres = tyres.size();
		System.out.println("Total No of Tyres available: " +noOfTyres);
		
		System.out.println("Printing the list of Tyres available:");
		
		//System.out.println(tyres.get(1).getText() + "==========> Amount is: "+ tyreAmounts.get(1).getText());
		//System.out.println(tyres.get(1).getText() + "==========> Amount is: "+ tyreAmounts.get(1).getText() + "=========> No of purchases: " +noOfPurchases.get(1).getText());
	
		for(int i=0; i<noOfTyres; i++) 
			{
				System.out.println(tyres.get(i).getText() + "==========> Amount is: "+ tyreAmounts.get(i).getText() + "=========> No of purchases: " +noOfPurchases.get(i).getText());
			}
		driver.quit();
	}

}
