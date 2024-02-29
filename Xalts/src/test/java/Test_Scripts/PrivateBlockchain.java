package Test_Scripts;

import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMREPO.Private_Blockchain;
import genericLiberary.BaseTest;

@Test
public class PrivateBlockchain extends BaseTest {
	
	public void LaunchChildNetwork() throws InterruptedException{
		
		Private_Blockchain private_blockchain = new Private_Blockchain(driver);
		
		//Clicking on Get started 
		private_blockchain.getGet_Started().click();
		
		// Click on Launch ONC child Network
		private_blockchain.getONC_Child_Network().click();
		
		// Enter Network name
		private_blockchain.getNetwork_Name().sendKeys("Node-5");
		
		//Enter Wallet Address
		private_blockchain.getWallet_address().sendKeys("0x88fa61d2faA13aad8Fbd5B030372B4A159BbbDFb");
		
		// Click on next button
		private_blockchain.getNext_Button().click();
		
		for(int i = 0;i<3;i++) {
			// Enter NodeID 
			private_blockchain.getNode().sendKeys("NodeID-2"+i);
			//Public IP 
			private_blockchain.getPublic_IP().sendKeys("123.87.32.5"+i);
			//Add Node
			private_blockchain.getAdd_Node().click();
		}
		
		//Click on next
		private_blockchain.getNext_Button_Node().click();
		
		//Click on Submit
		private_blockchain.getSubmit_Button().click();
		
		// Verify text present on Review and submit page
		WebElement NetworkName = private_blockchain.getNetwork_Name_Text();
		
		String fixedNetworkName = "Network Name";
		
		AssertJUnit.assertEquals(NetworkName.getText(), fixedNetworkName);
		Reporter.log("Network name present",true);
		
		WebElement WalletAddress = private_blockchain.getWallet_Address_Text();
		
		String fixedWalletAddress = "Wallet Address";
		
		AssertJUnit.assertEquals(WalletAddress.getText(), fixedWalletAddress);
		Reporter.log("Wallet address is present",true);
		
		WebElement NodeDetails = private_blockchain.getNode_Details_Text();
		
		String fixedNodeDetails = "Preview Node Details";
		
		AssertJUnit.assertEquals(NodeDetails.getText(), fixedNodeDetails);
		Reporter.log("Nodes are present",true);
		
	}

}
