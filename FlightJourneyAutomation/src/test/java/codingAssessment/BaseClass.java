package codingAssessment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void baseClass(){
		
		driver = new ChromeDriver();
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_csharp_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
	}

}
