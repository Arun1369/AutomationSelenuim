package com.Dubizzle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login  extends Usercredentials{
	//public String baseUrl = "http://dubai.dubizzle.com";
	//public WebDriver driver =new FirefoxDriver ();
	
	
	@BeforeTest
	
	public void launchBrowser (){
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	
	public void quitBrowser () {
		driver.quit();
		
	}
	
  @Test
  public void validLogin() {
	  
	  driver.findElement(By.id("sign-in-trigger")).click();
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(username);
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys(password);
	  loginButtton.click();
  }
}
