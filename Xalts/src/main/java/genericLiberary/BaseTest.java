package genericLiberary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	public UtilityMethods utility_methods = new UtilityMethods();
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://xaltsocnportal.web.app/");
	}
	
	@BeforeMethod
	public void login() throws IOException {
		
		// Click on Get Started Button
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		
		// Click on SignIn link
		driver.findElement(By.xpath("//button[text()='Already have an account? Click here to sign in.']")).click();
		
		//Enter login details
		driver.findElement(By.id("outlined-basic")).sendKeys("Qwerty@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Qwerty@123");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//button[text()='Sign Out']")).click();
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
}
