package LearningSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		List <WebElement> iframe = driver.findElements(By.tagName("iframe"));
		//Getting how many i frame are there in page
		System.out.println(iframe.size());
		//Switching to iframe
		driver.switchTo().frame("IF1");
		driver.findElement(By.name("firstname")).sendKeys("arun");
		
		//How to pass the index 
		
		//driver.switchTo().frame(0);
		
		//come back from iframe
		//driver.switchTo().defaultContent();
		
		
		
		
		

	}

}
