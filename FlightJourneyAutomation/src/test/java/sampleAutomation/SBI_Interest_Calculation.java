package sampleAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import fileOperations.ExcelUtils;

//Website: https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html

public class SBI_Interest_Calculation {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		String filePath = System.getProperty("user.dir")+"/testdata/SBI_SimpleInterest.xlsx";
		
		//Using the ExcelUtils class to get RowCount, CellCount and GetCellData methods:
		int rowCount = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1; i<=rowCount;i++) 
		{
			//Getting all the values from the excel row by row using a loop: 
			String principle = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateOfInterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String period1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);		
			String period2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String freq = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String expected_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
					
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
		Select per2dropdown = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		per2dropdown.selectByVisibleText(period2);
		
		Select freqdropdown = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		freqdropdown.selectByVisibleText(freq);
		
		//Clicking on Calculate button:
		driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
		//Doing the validation:
		String actual_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
		if(Double.parseDouble(expected_mvalue)==Double.parseDouble(actual_mvalue)) {
			
			System.out.println("Test Passed");
			ExcelUtils.writeData(filePath, "Sheet1", i, 7, "Pass");
			
		}else
			{
				System.out.println("Test Failed");
				ExcelUtils.writeData(filePath, "Sheet1", i, 7, "Fail");
			}
		
		//Clicking on Clear button
		driver.findElement(By.xpath("//img[@class='PL5']")).click();
		Thread.sleep(3000);
		}
		driver.quit();
	}
	
}
