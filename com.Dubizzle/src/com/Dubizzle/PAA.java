package com.Dubizzle;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PAA {
	public String baseUrl = "http://dubai.dubizzle.com";
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
	
  @Test
  public void loginTest() {
	  
	  driver.findElement(By.id("sign-in-trigger")).click();
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys("arun@sunfra.com");
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys("sunfra123");
	  driver.findElement(By.id("signin-button")).click();
	  driver.findElement(By.id("place_an_ad_callout_en")).click();
	  driver.findElement(By.linkText("Classifieds")).click();
	  driver.findElement(By.id("list-title")).sendKeys("Ennu Ninde Moideen story for sale");
	  driver.findElement(By.id("codi-submit")).click();
	  driver.findElement(By.linkText("Books")).click();
	  driver.findElement(By.linkText("Fiction")).click();
	  driver.findElement(By.linkText("Romance")).click();
	  driver.findElement(By.id("id_name")).clear();
	  driver.findElement(By.id("id_name")).sendKeys("Ennu Ninde Moideen Story for sale");
	  driver.findElement(By.id("upload-button-container")).sendKeys("C:\\Users\\Arun\\Desktop\\Moideen.jpg");
	  driver.findElement(By.id("id_phone_number")).sendKeys("+971503265985");
	  driver.findElement(By.id("id_price")).sendKeys("98562");
	  driver.findElement(By.id("id_description")).sendKeys("Malayalam Real story which is happend in Mukkam");
	  Select agedrpdown = new Select(driver.findElement(By.id("id_age")));
	  agedrpdown.selectByValue("5");
	  Select usagedrpdown = new Select (driver.findElement(By.id("id_usage")));
	  usagedrpdown.selectByValue("2");
	  Select conditiondrpdown =new Select (driver.findElement(By.id("id_condition")));
	  conditiondrpdown.selectByValue("3");
	  Select typedrpdown = new Select (driver.findElement(By.id("id_type")));
	  typedrpdown.selectByValue("2");
	  driver.findElement(By.id("id_neighbourhood")).sendKeys("Abhu hali");
	  driver.findElement(By.id("enter-details-submit")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
}

