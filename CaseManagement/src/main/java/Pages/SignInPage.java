package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import BasePackage.DriverClass;

public class SignInPage extends DriverClass {
	
	private By Email					=  By.id("email");
	private By Password					=  By.id("pas");
	private By Login 					=  By.id("buttonDisable");
	private By SignUp					=  By.xpath("//a[@class='btn btn-default btn-mo']");
	private By ForgotPassword 			=  By.xpath("//button[@class='btn-link ']");
	private By LanSelection 			=  By.id("switch-language");
	
	
	public void loginToAccount(String username, String password) throws InterruptedException{
		driver.findElement(Email).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Login).click();
	    Thread.sleep(5000);
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl ="https://casem.herokuapp.com/home" ;
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	public void login(String username, String password){
		driver.findElement(Email).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Login).click();
		
	}

}
