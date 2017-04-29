package Basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverclass {
	
	public static WebDriver driver;
	 
public void launchBrowser(String BrowserName) throws IOException{
		
		switch(BrowserName){
		case "FF":
			driver=new FirefoxDriver();
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\java\\Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(getValuesFromPropertiesFile("url"));
		
		
	}

public String getValuesFromPropertiesFile(String key) throws IOException{
	String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\Config\\config.properties";
	Properties prop = new Properties ();
	FileInputStream fis = new FileInputStream(filepath);
	prop.load(fis);
	return prop.getProperty(key);
	
	
}


}


