package com.caseM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class constandmathods {
	
	static WebDriver driver;
	

		public static  String getValuesFromProperties1 (String Key) throws IOException{
			String filepath = "C:\\Users\\Arun\\workspace\\CaseM\\casem.properties";
			Properties prop = new Properties ();
			FileInputStream fis = new FileInputStream (filepath);
			prop.load (fis);
			return prop.getProperty(Key);
			
			
		}
		
		public static void launchBrowser (String Browsername) {
			switch (Browsername){
			case "FF":
				driver=new FirefoxDriver();
				break;
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver.exe");
				driver=new ChromeDriver();
				break;
							
			}
			
		}
}
