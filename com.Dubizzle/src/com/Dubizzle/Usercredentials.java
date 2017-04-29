package com.Dubizzle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usercredentials {

	public String baseurl = "http://dubai.dubizzle.com";
	public String username = "arun@sunfra,com";
	public String password = "sunfra123";
	public WebDriver driver =new FirefoxDriver ();
	WebElement  loginButtton = driver.findElement(By.id("signin-button"));
	
		// TODO Auto-generated method stub

	}


