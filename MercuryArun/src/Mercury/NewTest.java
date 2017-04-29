package Mercury;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest{
	public String baseUrl = "http://newtours.demoaut.com/";
	public WebDriver driver;
	
	@BeforeTest
	
	public void setbaseUrl (){
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	
	public void verifHomepagetitile (){
		//String expectedTitle = "Welcome: Mercury Tours";
		//String actualTitle = driver.getTitle();
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}
	
	@AfterTest
	
	public void endSession (){
		driver.quit();
	}
}

	