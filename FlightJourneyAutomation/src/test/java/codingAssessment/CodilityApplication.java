package codingAssessment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Valid Credentials: login@codility.com ; password
 * Invalid Credentials: unknown@codility.com ; password
 * */

public class CodilityApplication extends BaseClass {

	@Test(priority=0)
	public void fieldsCheck() {

		//1. Check if the email and password fields are on the main screen of the application:
		boolean emailFieldIsDisplayedCheck = driver.findElement(By.id("email-input")).isDisplayed();
		System.out.println("Is the Email Field with id as email-input is Displayed in main screen:" +emailFieldIsDisplayedCheck);
		
		boolean pwdFieldIsDisplayedCheck = driver.findElement(By.id("password-input")).isDisplayed();
		System.out.println("Is the Pwd Field with id as email-password is Displayed in main screen:" +pwdFieldIsDisplayedCheck);
		
		boolean loginBtnIsDisplayedCheck = driver.findElement(By.id("login-button")).isDisplayed();
		System.out.println("Is the Login Button Field with id as login-button is Displayed in main screen:" +loginBtnIsDisplayedCheck);
	
	}


		@Test(priority=1)
		public void ValidCredentialsCheck() {

		//Checking if the Email Input has id equal to email-input:
		driver.findElement(By.id("email-input")).sendKeys("login@codility.com"); //This confirms that email input field is email-input
		driver.findElement(By.id("password-input")).sendKeys("password");  //This confirms that password input field is password-input
		driver.findElement(By.id("login-button")).click(); //This confirms that login button field has id equal to login-button
		//Validating if the div with class equal to success message containing message as "Welcome to Codility" is visible:
		String actualSuccessMsg = driver.findElement(By.xpath("//div[@class='message success']")).getText();
		System.out.println(actualSuccessMsg);
		
		if(actualSuccessMsg.equals("Welcome to Codility")) {
			System.out.println("Expected Success Message matches with Actual Success Message");
		}

	}
		
		@Test(priority=2)
		public void wrongCredentialsCheck(){
			
			//1. Check if the email and password fields are on the main screen of the application:
			//Checking if the Email Input has id equal to email-input:
			driver.findElement(By.id("email-input")).sendKeys("unknown@codility.com"); //This confirms that email input field is email-input
			driver.findElement(By.id("password-input")).sendKeys("password");  //This confirms that password input field is password-input
			driver.findElement(By.id("login-button")).click(); //This confirms that login button field has id equal to login-button
			//Validating if the div with class equal to success message containing message as "Welcome to Codility" is visible:
			String actualErrorMsg = driver.findElement(By.xpath("//div[@class='message error']")).getText();
			System.out.println(actualErrorMsg);
			
			if(actualErrorMsg.equals("You shall not pass! Arr!")) {
				System.out.println("Expected Error Message matches with Actual Error Message");
			}
		}
		
		@Test(priority=3)
		public void invalidEmailCheck() {

			//1. Check if the email and password fields are on the main screen of the application:
			//Checking if the Email Input has id equal to email-input:
			driver.findElement(By.id("email-input")).sendKeys(""); //This confirms that email input field is email-input
			driver.findElement(By.id("password-input")).sendKeys("password");  //This confirms that password input field is password-input
			driver.findElement(By.id("login-button")).click(); //This confirms that login button field has id equal to login-button
			//Validating if the div with class equal to success message containing message as "Welcome to Codility" is visible:
			String actualEmailValidationMsg = driver.findElement(By.xpath("//div[@class='validation error']")).getText();
			System.out.println(actualEmailValidationMsg);
			
			if(actualEmailValidationMsg.equals("Email is required")) {
				System.out.println("Expected Email Validation Message matches with Actual Email Validation Message");
			}
		}

		@Test(priority=4)
		public void invalidPasswordCeck() {
			
			//1. Check if the email and password fields are on the main screen of the application:
			//Checking if the Email Input has id equal to email-input:
			driver.findElement(By.id("email-input")).sendKeys("login@codility.com"); //This confirms that email input field is email-input
			driver.findElement(By.id("password-input")).sendKeys("");  //This confirms that password input field is password-input
			driver.findElement(By.id("login-button")).click(); //This confirms that login button field has id equal to login-button
			//Validating if the div with class equal to success message containing message as "Welcome to Codility" is visible:
			String actualPasswordlValidationMsg = driver.findElement(By.xpath("//div[@class='validation error']")).getText();
			System.out.println(actualPasswordlValidationMsg);
			
			if(actualPasswordlValidationMsg.equals("Password is required")) {
				System.out.println("Expected Password Validation Message matches with Actual Password Validation Message");
			}
		}
		
		@AfterMethod()
		public void postCheck() throws InterruptedException{
			Thread.sleep(3000);
			driver.close();
		}
		
}
