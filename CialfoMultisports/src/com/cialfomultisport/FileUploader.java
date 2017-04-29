package com.cialfomultisport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FileUploader {
	public static  WebDriver driver ;
	


static Login lo = new Login();


@Test 
public static void launchbroeswrfortest () throws IOException {
	lo.launchBrowser(lo.getValueFromProperties("Browsername"));
	driver.get(lo.getValueFromProperties("baseurl"));
	driver.findElement(By.id("uploadname1")).click();
}
}