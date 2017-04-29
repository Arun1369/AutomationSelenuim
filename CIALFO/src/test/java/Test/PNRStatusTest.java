package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basepackage.Driverclass;
import Pages.HomePage;
import Pages.PNREnquiry;

public class PNRStatusTest extends Driverclass {
	PNREnquiry pnrs = new PNREnquiry();
	HomePage homepage  = new HomePage();
	
	
	@Test(groups={"smoke"})
	public void chePnrChekBox (){
		homepage.clickPNRstatusoption();// Do we need to call home page pnr status onall methods
		pnrs.isPnrselected();
		Assert.assertEquals(pnrs.isPnrselected(), true, null);
	}/*
		@Test(groups={"smoke"})
	public void pnrstatusCheck (){
		homepage.clickPNRstatusoption();
		pnrs.pnrCheckbox();
		pnrs.checkPNRStatus("48045828");
	}*/
	@Test(groups={"smoke"})
	public void mobileNumberalert(){
		homepage.clickPNRstatusoption();
		pnrs.pnrCheckbox();
		pnrs.checkPNRStatus("48045828");
		pnrs.clickSubmitButton();
		Alert al = driver.switchTo().alert();
		String expected = al.getText();
		String actualerror = "Please enter valid 10 digits mobile number.";
		al.accept();
		Assert.assertEquals(expected, actualerror);		
	}
	//How to test reset functionality 
	@Test(groups={"smoke"})
	public void invalidPNRerror(){
		//String pnrvalue = driver.findElement(By.id("afaf")).getAttribute("value");
		
		homepage.clickPNRstatusoption();
		pnrs.pnrCheckbox();
		pnrs.checkPNRStatus("48045828");
		pnrs.mobilenoText("8585858585");
		pnrs.clickSubmitButton();
		String expectederror = "Please enter valid PNR and Prefix.";
		String actualError   = driver.findElement(By.id("errorMsg")).getText();
		Assert.assertEquals(expectederror, actualError);
		
	}
	
			
	

}
