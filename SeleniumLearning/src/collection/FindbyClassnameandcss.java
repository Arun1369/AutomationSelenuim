package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindbyClassnameandcss {
	public static void main (String args[]){
		
	 WebDriver driver = new FirefoxDriver ();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("u_0_1")).sendKeys("Arun");
	 driver.findElement(By.cssSelector("input[id='u_0_3']")).sendKeys("panangattu");
	 driver.findElement(By.id("u_0_5")).sendKeys("9901395048");
	 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("9901395048");
	 driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("fdfa");
	 
	 
	 
	 
	 
	 
	
	 
	 }
	 
	 
	 

}
