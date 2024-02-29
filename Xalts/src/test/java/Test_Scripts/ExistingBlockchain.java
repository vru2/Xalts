package Test_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.Existing_Blockchain;
import genericLiberary.BaseTest;

@Test
public class ExistingBlockchain extends BaseTest {
	
	public void Onboard_Nodes() throws InterruptedException {
		 
		Existing_Blockchain existing_blockchain = new Existing_Blockchain(driver);
		
		//Clicking on Get started 
		existing_blockchain.getGet_Started().click();
		
		//Clicking on ON Board ONC Node
		existing_blockchain.getOn_board_ONC_Node().click();
		

		for(int i = 0;i<3;i++)
		{
			//Node ID
			existing_blockchain.getNode().sendKeys("NodeID-2"+i);
			
			//Public IP
			existing_blockchain.getPublic_IP().sendKeys("121.132.12.4"+i);
			//Add Node
			existing_blockchain.getAdd_Node().click();
		}
	
		// Click on Next
		existing_blockchain.getNext_Button().click();
		
		//Click on Wallet address
		existing_blockchain.getWallet_address().sendKeys("0x88fa61d2faA13aad8Fbd5B030372B4A159BbbDFb");
		
		//Click on Add wallet
		existing_blockchain.getAdd_Wallet_Button().click();
		
		Thread.sleep(2000);
		
		//Click on Next
		existing_blockchain.getNext_Button_WalletPage().click();
		
		//Click on Submit
		existing_blockchain.getSubmit_Button().click();
		
		
		// Verify text present on Review and submit page 
		WebElement currentTextNode = existing_blockchain.getNode_Text();
		
		String fixedTextNode = "Preview Node Details";
		
		AssertJUnit.assertEquals(currentTextNode.getText(), fixedTextNode);
		Reporter.log("Nodes are present",true);
		
		WebElement currentTextWallet = existing_blockchain.getWallet_Text();
		
		String fixedTextWallet = "Preview Wallet Details";
		
		AssertJUnit.assertEquals(currentTextWallet.getText(), fixedTextWallet);
		Reporter.log("Wallet Details are present",true);
		
	}

}
