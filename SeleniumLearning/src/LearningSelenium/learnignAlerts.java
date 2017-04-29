package LearningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class learnignAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("html/body/button")).click();
		
		//Before switching the alert, we have to wait alert is displayed or not 
		
		//WebDriverWait wait = new WebDriverWait (driver, 10);
		//wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert al = driver.switchTo().alert();
		System.out.println("alertmessage is"+al.getText());
		al.accept();
		
				
				
		

	}

}
