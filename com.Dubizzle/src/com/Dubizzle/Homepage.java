package com.Dubizzle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Homepage  {
	public String baseUrl = "https://dubai.dubizzle.com/change-location/";
	public WebDriver driver = new FirefoxDriver ();
	
	
  @Test
  public void homePage() {
	  driver.get(baseUrl);
	  List <WebElement> linkElements = driver.findElements(By.tagName("a"));
	  String [] linkTexts = new String [linkElements.size()];
	  int i = 0;
	  
	
			  
	  
  }
}
