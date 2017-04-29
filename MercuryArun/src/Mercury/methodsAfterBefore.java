package Mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class methodsAfterBefore {
	private static final int Priority = 0;
	public String url = "http://newtours.demoaut.com/";
	public WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void launchbrower (){
		driver.get(url);
	}
	
	@BeforeMethod 
	
	public  void verifyHomepagetitle (){
		 String  expected = "Welcome: Mercury Tours";
		 String actual = driver.getTitle();

		Assert.assertEquals(expected, actual);
	}
	
	@Test (priority = 0)
	public void register(){
        driver.findElement(By.linkText("REGISTER")).click();
		String expected = ("Register: Mercury Tours");
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	@Test (priority = 1)
	
	public void Support (){
		driver.findElement(By.linkText("SUPPORT")).click();
		String expected = "Support : Mercury Tours";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	
	@AfterMethod
	
   public void backToHme (){
		driver.findElement(By.linkText("HOME")).click();
		
	}
	
	@AfterTest
	
	public void endSession (){
		driver.quit();
	}
	}