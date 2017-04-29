package com.swiminida;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	public String baseUrl = "http://swimindia.in";
	public WebDriver driver =new FirefoxDriver ();
	
@BeforeTest
	
	public void launchBrowser (){
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	
	public void quitBrowser () {
		driver.quit();
		
	}
 /* @Test
  public void validLogin() throws Exception {
	  driver.findElement(By.xpath("//span[@id='ssologinlink']")).click();
	  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("sujit");
	  driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("swimindia");
	  driver.findElement(By.xpath("//button[@id='login-button']")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  String username=driver.findElement(By.xpath("//span[@class='user-name']")).getText();
	  if (username.contains("Sujit")){
		  System.out.println("Login sucessfull");
	  }
	  else {
		  System.out.println("Logged in failed");
	
	  }
	  }*/
  
  @Test
  public void invalidlogin1 () {
	  driver.findElement(By.xpath("//span[@id='ssologinlink']")).click();
	  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("");
	  driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("");
	  driver.findElement(By.xpath("//button[@id='login-button']")).click();
	  driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	  String alert = driver.switchTo().alert().getText();
	  System.out.println(alert);
	  
	  
  }
	  
  }
  

