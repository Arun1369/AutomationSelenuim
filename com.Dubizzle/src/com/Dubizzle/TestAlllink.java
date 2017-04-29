package com.Dubizzle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestAlllink {
	public static void main (String args[]){
		

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://dubai.dubizzle.com/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	List <WebElement> webelements = driver.findElements(By.tagName("a"));
	webelements.size();
	System.out.println(webelements.size());
	
	
	for (int i=0;i<webelements.size();i++){
		String cv = webelements.get(i).getText();
		
		
		
			

			
		
		}
		
		//String cv = linktexts.get(i).getText();
		//System.out.println(cv);
	
}
	
	
}


