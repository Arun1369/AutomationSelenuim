package Test;

import org.testng.annotations.Test;

import Basepackage.Driverclass;
import Pages.CancelTickets;
import Pages.HomePage;

public class CancelTiccketsTest extends Driverclass{
	HomePage home = new HomePage();
	CancelTickets can = new CancelTickets();
	
	@Test(groups={"smoke"})
	public void checkingReset() throws InterruptedException{
		home.clickCancelTickets();
		can.enterMobileno("65656565");
		can.getMobileNumBeforeReset();
		can.clickRestbutton();
		can.getMobileNumAfterReset();
		can.verifyMobileNumber();

		
		
		
	}
	

}
