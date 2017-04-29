package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class LearningActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		/*driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(3000);
		
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();*/
		
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		WebElement tutorialmenu = driver.findElement(By.xpath("//ul[@id='primary-menu']/li[2]"));
		Actions act=new Actions (driver);
		act.moveToElement(tutorialmenu).build().perform();
		driver.findElement(By.linkText("Mobile Application Testing")).click();
		
			
		
		
		
		
		
		
		
		
		
	}

}
