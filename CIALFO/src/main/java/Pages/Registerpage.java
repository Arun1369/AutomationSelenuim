package Pages;

import org.openqa.selenium.By;

import Basepackage.Driverclass;

public class Registerpage extends Driverclass {
	By regUname      		= By.id("email");
	By fullName				= By.id("fullName");
	By MobNo				= By.id("mobileNo");
	By Addbutton 			= By.xpath("//input[@class='continueBtn']");
	
	public void regnametextfield (String name){
		driver.findElement(regUname).sendKeys(name);
	}
	public void fullnameTextfield (String fullname){
		driver.findElement(fullName).sendKeys(fullname);
	}
	public void mobNotextfield (String mobno){
		driver.findElement(MobNo).sendKeys(mobno);		
	}
	public void clickAddButton (){
		driver.findElement(Addbutton).click();
	}
	
	
	

}
