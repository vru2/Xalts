package POMREPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Existing_Blockchain {
	
	@FindBy(xpath="//button[text()='Get Started']")
	private WebElement Get_Started;
	
	@FindBy(xpath="(//div[@class='getting-started-option'])[1]")
	private WebElement On_board_ONC_Node;
	
	@FindBy(xpath="//*[@id=\"outlined-basic\"]")
	private WebElement Node;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/main[1]/section[3]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement Public_IP;
	
	@FindBy(xpath="//button[text()='+ Add Node ']")
	private WebElement Add_Node;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next_Button;
	
	@FindBy(xpath="//*[@id=\"outlined-basic\"]")
	private WebElement Wallet_address;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/section[3]/div/div/div[1]/div[2]/button")
	private WebElement Add_Wallet_Button;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next_Button_WalletPage;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submit_Button;
	
	@FindBy(xpath="//div[text()='Preview Node Details']")
	private WebElement Node_Text;
	
	@FindBy(xpath="//div[text()='Preview Wallet Details']")
	private WebElement Wallet_Text;
	
	public Existing_Blockchain(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getGet_Started() {
		return Get_Started;
	}

	public WebElement getOn_board_ONC_Node() {
		return On_board_ONC_Node;
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

	public WebElement getNext_Button() {
		return Next_Button;
	}

	public WebElement getWallet_address() {
		return Wallet_address;
	}

	public WebElement getAdd_Wallet_Button() {
		return Add_Wallet_Button;
	}

	public WebElement getNext_Button_WalletPage() {
		return Next_Button_WalletPage;
	}

	public WebElement getSubmit_Button() {
		return Submit_Button;
	}

	public WebElement getNode_Text() {
		return Node_Text;
	}

	public WebElement getWallet_Text() {
		return Wallet_Text;
	}

}
