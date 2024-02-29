package Test_Scripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMREPO.Existing_User;

@Test
public class ExistingUser {
	
	public void existing_user() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://xaltsocnportal.web.app/");
		
		Existing_User existing_user = new Existing_User(driver);
		
		// Get Started
		existing_user.getGet_Started().click();
		
		// Enter Email ID
		existing_user.getEmail_ID().sendKeys("Qwerty@gmail.com");
		
		//Enter Password
		existing_user.getPassword().sendKeys("Qwerty@123");
		
		// Enter Confirm Password
		existing_user.getConfirm_Password().sendKeys("Qwerty@123");
		
		// Click on SignUp
		existing_user.getSign_up_Button().click();
		
		Thread.sleep(3000);
		
		 // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept (click OK) the alert
        alert.accept();
        
        driver.quit();
		
	}

}
