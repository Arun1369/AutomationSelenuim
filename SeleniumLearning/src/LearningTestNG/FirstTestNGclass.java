package LearningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class FirstTestNGclass {
	 WebDriver driver = new FirefoxDriver ();

	
	public void suraj (String Searchvalue){
		driver.findElement(By.id("")).sendKeys(Searchvalue);
	}
	
	
	@BeforeClass
	public void beoreclass () {
		System.out.println("beforeclass");
	}
	@AfterClass
	public void afterclass () {
		System.out.println("Afterclass");
	}
	
	@BeforeMethod 
	public void beforemethod() {
		System.out.println("Beforemethod");
	}
	
	@AfterMethod
	
	public void afterMethod(){
		System.out.println("aftermethod");
	}
	
	@Parameters ("arun")
  public void param (String arun) {
		System.out.println(arun);
		suraj("kakak");
		
	}
	
	
	
	@Test (priority=1) //Setting priority 
	public void login () {
		System.out.println("Arun");
		Assert.assertEquals(false, true);
	}
	
	
	
	
	@Test (enabled = true,groups = {"smoke", "regression"})
	
	public void arun (){
		System.out.println("Skipped Testng");
	}
	
	@Test (dependsOnMethods ="login")
	public void logout () {
		System.out.println("logout");
	
}
}
