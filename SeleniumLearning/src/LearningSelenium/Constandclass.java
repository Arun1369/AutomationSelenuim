package LearningSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Constandclass {
	WebDriver driver;
	
	public void launchBrowser (String Browsername) {
		switch (Browsername){
		case "FF":
			driver= new FirefoxDriver ();
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
					
		}
	}
	
	public String getvaluesfromProperties(String key) throws IOException{
		String filepath = "C:\\Users\\Arun\\workspace\\SeleniumLearning\\src\\LearningSelenium\\Selenuimfile.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	
	

}
