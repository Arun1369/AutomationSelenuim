package Pages;

import org.openqa.selenium.By;

import Basepackage.Driverclass;
import junit.framework.Assert;

public class CancelTickets extends Driverclass{
	By HeadingOfThePage 				= By.xpath("//span[@class='innerpageTitleHdead']");
	By PNRNoTextfield					= By.id("pnrPrefixWithTktNo");
	By TXNPwd							= By.id("uidNumber");
	By MobileNo							= By.id("mobileNo");
	By SearchButton 					= By.id("searchBtn");
	By ResetButton 						= By.id("resetBtn");
	
	String beforeResetmobileNumber = null;
	String afterResetmobileNumber = null;
	
	public void getTitleOfThePage (){
		driver.findElement(HeadingOfThePage).getText();
	}

	public void enterPNRNo(String value){
		driver.findElement(PNRNoTextfield).sendKeys(value);		
	}
	public void enterTXNPwd(String value){
		driver.findElement(TXNPwd).sendKeys(value);		
	}
	public void enterMobileno(String value) throws InterruptedException{
		driver.findElement(MobileNo).sendKeys(value);
		Thread.sleep(5000);
	}
	
	public void getMobileNumBeforeReset(){
		beforeResetmobileNumber = driver.findElement(MobileNo).getAttribute("value");
		System.out.println("beforeResetmobileNumber - " + beforeResetmobileNumber);
	}
	
	public void getMobileNumAfterReset(){
		afterResetmobileNumber = driver.findElement(MobileNo).getAttribute("value");
		System.out.println("afterResetmobileNumber - " + afterResetmobileNumber);
	}
	public void clickSearhButton (){
		driver.findElement(SearchButton).click();
	}
	public void clickRestbutton (){
		driver.findElement(ResetButton).click();
	}
	
	public void verifyMobileNumber(){
		if(!beforeResetmobileNumber.equalsIgnoreCase(afterResetmobileNumber)){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
