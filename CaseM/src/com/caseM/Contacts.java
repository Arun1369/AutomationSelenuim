package com.caseM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Contacts {
	static WebDriver driver;
	
	public static void contactsearch (String Searchvalue){
		driver.findElement(By.id("list-search")).sendKeys(Searchvalue);
		driver.findElement(By.xpath("//button[@class='btn-non']"));				
	}
	
	@Test
	public void addingContacts (){
		driver.findElement(By.cssSelector("i.fa.fa-plus")).click();
		driver.findElement(By.id("name")).sendKeys("Vijayan");
		WebElement Role = driver.findElement(By.id("requires"));
		Select select = new Select (Role);
		select.selectByValue("2");
		
		WebElement Type = driver.findElement(By.name("newContactSubType.id"));
		Select select1 = new Select (Type);
		select1.selectByValue("2");
		driver.findElement(By.xpath("//input[@value='Create']")).click();
		contactsearch("Vijayan");
		String contactname = driver.findElement(By.linkText("Vijayan")).getText();
		Assert.assertEquals(contactname, "vijayan","Displaying name");
			
	}
	
	public void editContact(){
		contactsearch("Vijayan");
		try {
			String contactname;
			
		}
		catch (Exception e){
			System.out.println("Contactname not found");
		}
			
			
		}
		
	}

}
