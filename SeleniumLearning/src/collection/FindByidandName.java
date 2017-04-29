package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByidandName {
	public static void main (String args[]){
		
	 WebDriver driver = new FirefoxDriver ();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 
	 driver.findElement(By.id("email")).sendKeys("arun");
	 driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	 
	
	 
	 }
	 
	 
	 

}
