package LearningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='ssologinlink']")).click();
		  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("");
		  WebDriverWait explicitwait = new WebDriverWait (driver,60);
		  explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-password']")));
		  
		  driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("");
		  
		 // Wait <WebDriver> wait 
		  driver.findElement(By.xpath("//button[@id='login-button']")).click();
	}

}
