package codingAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyPasswordCheck1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_csharp_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		/*
		 * Valid Credentials: login@codility.com ; password
		 * Invalid Credentials: unknown@codility.com ; password
		 * */
		
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

}
