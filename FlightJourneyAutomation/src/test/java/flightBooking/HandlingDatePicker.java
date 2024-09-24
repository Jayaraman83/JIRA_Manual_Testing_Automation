package flightBooking;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).sendKeys("08/04/2024");
		driver.findElement(By.id("datepicker")).clear();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/04/2024");  //Format is MM/DD/YYYY
		
		//Now Writing script to click on Future Year Date from Date Picker using While loop:
		driver.findElement(By.id("datepicker")).clear();
		driver.findElement(By.id("datepicker")).click();
		
		String year = "2025";
		String month = "May";
		String date = "20";
		
		while(true) {
			
		String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();	
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		//Doing a comparison if current month equal to the Expected Month & Current Year equal to Expected Year:
		if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
				//To click on future years
				driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();
				//To Click on previous years
				//driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-w']")).click();

		}
		
		
		//Now Picking the Date from Date Picker:
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt : allDates) {
			
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
	}

}
