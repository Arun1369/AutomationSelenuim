package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Basepackage.Driverclass;

public class PNREnquiry extends Driverclass{
	
	By PNRchkbox 							= By.id("isTranxSuccess_1");
	By Transactionstatucchxbox 				= By.id("isTranxSuccess_2");// ask doubt about this 
	By Servicestatuschekbox			        = By.id("isTranxSuccess_5");
	By pnrtextFiled 						= By.id("pnrPrefixWithTktNo");
	By mobileno								= By.id("mobileNo");
	By submitbutton 						= By.id("searchBtn");
	
	
	
	
	
		public void pnrCheckbox (){
		if (driver.findElement(PNRchkbox).isSelected()){
			System.out.println("PNR check box already selected");
		}
		else {
			driver.findElement(PNRchkbox).click();	
		}
		
		
	}	
		public boolean isPnrselected(){
			boolean pnr = driver.findElement(PNRchkbox).isSelected();
			return pnr;
		}
		public void clickSubmitButton (){
			driver.findElement(submitbutton).click();
		}
	
	    public 	void checkPNRStatus (String number){// ask doubt about this 
		driver.findElement(pnrtextFiled).sendKeys(number);
			
	}
	    public void mobilenoText(String number){
	    	driver.findElement(mobileno).sendKeys(number);
	    }
		
	
	

}
