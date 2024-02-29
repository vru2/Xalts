package Test_Scripts;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POMREPO.SignUp;

@Test
public class SignUP{
	
	public int getRandomNumber() {
		Random r = new Random();
		return r.nextInt(1000);
	}
	
	public void signUp() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://xaltsocnportal.web.app/");
		
		SignUp sign_up = new SignUp(driver);
		
		//Click on Get Started
		sign_up.getGet_Started().click();
		
		// Enter Email ID (Every time new emailId will generate)
		sign_up.getEmail_ID().sendKeys("abcd"+getRandomNumber()+"@gmail.com");
		
		//Enter Password
		sign_up.getPassword().sendKeys("Qwerty@123");
		
		// Enter Confirm Password
		sign_up.getConfirm_Password().sendKeys("Qwerty@123");
		
		// Click on SignUp
		sign_up.getSign_up_Button().click();
		
		// Verify Signup is done by validating the signOut link 
		WebElement signOutText = sign_up.getSign_up_Text();
				
		String fixedText = "SIGN OUT";
				
		AssertJUnit.assertEquals(signOutText.getText(), fixedText);
		Reporter.log("SignUp done",true);
		
		driver.quit();
		
	}

}
