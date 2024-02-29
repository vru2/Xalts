package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	
	@FindBy(xpath="//button[text()='Get Started']")
	private WebElement Get_Started;
	
	@FindBy(xpath="//*[@id=\"outlined-basic\"]")
	private WebElement Email_ID;
	
	@FindBy(xpath="/html/body/div/div/main/div[2]/div[2]/div/input")
	private WebElement Password;
	
	@FindBy(xpath="/html/body/div/div/main/div[2]/div[3]/div/input")
	private WebElement Confirm_Password;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement Sign_up_Button;
	
	@FindBy(xpath="//button[text()='Sign Out']")
	private WebElement Sign_up_Text;
	
	public SignUp(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getGet_Started() {
		return Get_Started;
	}

	public WebElement getEmail_ID() {
		return Email_ID;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirm_Password() {
		return Confirm_Password;
	}

	public WebElement getSign_up_Button() {
		return Sign_up_Button;
	}

	public WebElement getSign_up_Text() {
		return Sign_up_Text;
	}

}
