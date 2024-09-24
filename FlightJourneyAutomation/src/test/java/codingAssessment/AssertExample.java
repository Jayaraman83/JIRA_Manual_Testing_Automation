package codingAssessment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertExample {
    
    WebDriver driver;
    
    @BeforeMethod
    public void setup() {
        // Setup ChromeDriver
    	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to the website
        driver.get("https://example.com");
    }
    
    @Test
    public void verifyPageTitleAndLoginButton() {
        // **Hard Assertion Example**
        // Verify that the title of the page is correct
        String actualTitle = driver.getTitle();
        String expectedTitle = "Expected Page Title";
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");

        // **Soft Assertion Example**
        // Verify that the "Login" button is present on the page
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed!");
        
        // You can continue with further tests if the soft assertion fails
    }
    
    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}