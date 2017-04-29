package LearningSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String paranetwindowhandle = driver.getWindowHandle();	
		
		//Set wont allow Dublicate values 
		Set <String> allwindows = driver.getWindowHandles();
		
		//Closing all windows except parent window 
		for (String currentwindow : allwindows) {
			driver.switchTo().window(currentwindow);
			if(!currentwindow.equalsIgnoreCase(paranetwindowhandle)){
				driver.close();
			
		
		/*
		for (String currentwindow : allwindows) {
			driver.switchTo().window(currentwindow);
			System.out.println(currentwindow);
			System.out.println("---"+driver.getTitle());
			String title = driver.getTitle();
			
			if (title.equalsIgnoreCase("Amazon")){
				driver.findElement(By.xpath("/html/body/a/img")).click();*/
			}
			
		}
	}
}
			
			
			
			
		
		

	


