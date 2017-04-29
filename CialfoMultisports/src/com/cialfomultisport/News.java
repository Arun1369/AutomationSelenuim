package com.cialfomultisport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class News {
	static Login lo = new Login();
	

	@Test 
	public static void launchbroeswrfortest () throws IOException {
		lo.launchBrowser(lo.getValueFromProperties("Browsername"));
		
	/*	
		driver.get(lo.getValueFromProperties("baseurl"));
		driver.manage().window().maximize();
		 driver.findElement(By.id("show-login")).click();
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getValueFromProperties("Individualusername"));
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(getValueFromProperties("IndividualPassword"));
		  driver.findElement(By.id("signin-okButton")).click();
		
	}
	
	@Test
	public static void news (){
		driver.findElement(By.linkText("news")).click();
		driver.findElement(By.xpath("html/body/app/div/div/main/div/user-news-list/div/newsusercard[1]/div/div[2]/p/a")).click();
		
	}*/
	
	
	

}
}
