package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Private_Blockchain {
	
	@FindBy(xpath="//button[text()='Get Started']")
	private WebElement Get_Started;
	
	@FindBy(xpath="//h2[text()='Launch OCN Child Network']")
	private WebElement ONC_Child_Network;
	
	@FindBy(xpath="//*[@id=\"outlined-basic\"]")
	private WebElement Network_Name;
	
	@FindBy(xpath="/html/body/div/div/main/section[3]/div/div/div[1]/div[2]/div/input")
	private WebElement Wallet_address;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next_Button;
	
	@FindBy(xpath="//*[@id=\"outlined-basic\"]")
	private WebElement Node;
	
	@FindBy(xpath="/html/body/div/div/main/section[3]/div/div/div[1]/div[2]/div/input")
	private WebElement Public_IP;
	
	@FindBy(xpath="//button[text()='+ Add Node ']")
	private WebElement Add_Node;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next_Button_Node;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submit_Button;
	
	@FindBy(xpath="//div[text()='Network Name']")
	private WebElement Network_Name_Text;
	
	@FindBy(xpath="//div[text()='Wallet Address']")
	private WebElement Wallet_Address_Text;
	
	@FindBy(xpath="//div[text()='Preview Node Details']")
	private WebElement Node_Details_Text;
	
	public Private_Blockchain(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getGet_Started() {
		return Get_Started;
	}

	public WebElement getONC_Child_Network() {
		return ONC_Child_Network;
	}

	public WebElement getNetwork_Name() {
		return Network_Name;
	}

	public WebElement getWallet_address() {
		return Wallet_address;
	}

	public WebElement getNext_Button() {
		return Next_Button;
	}

	public WebElement getNode() {
		return Node;
	}

	public WebElement getPublic_IP() {
		return Public_IP;
	}

	public WebElement getAdd_Node() {
		return Add_Node;
	}

	public WebElement getNext_Button_Node() {
		return Next_Button_Node;
	}

	public WebElement getSubmit_Button() {
		return Submit_Button;
	}

	public WebElement getNetwork_Name_Text() {
		return Network_Name_Text;
	}

	public WebElement getWallet_Address_Text() {
		return Wallet_Address_Text;
	}

	public WebElement getNode_Details_Text() {
		return Node_Details_Text;
	}

}
