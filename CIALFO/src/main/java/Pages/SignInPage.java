package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basepackage.Driverclass;

public class SignInPage extends Driverclass {
	
	By password				= By.id("password");
	By loginButton			= By.id("submitBtn");
	By Loggedoubutton       = By.linkText("Logout");
	By userName 			= By.id("userName");

	
	
	public void enterUserName(String uName){
		driver.findElement(userName).sendKeys(uName);
		//driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void enterPassword(String pwd){
		driver.findElement(password).sendKeys(pwd);	
	}
	
	public void clickLoginButton(){
		driver.findElement(loginButton).click();
	}
	public void clickLoggedoutbutton(){
		driver.findElement(Loggedoubutton).click();
	}


		
	}
	

