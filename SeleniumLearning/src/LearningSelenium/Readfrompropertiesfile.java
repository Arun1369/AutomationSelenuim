package LearningSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Readfrompropertiesfile {
	
	static WebDriver driver;
	
	@Test

	public static void loginToaccount () throws IOException {
		// TODO Auto-generated method stub
		/*String filepath = "C:\\Users\\Arun\\workspace\\SeleniumLearning\\src\\LearningSelenium\\Selenuimfile.properties";
		
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		System.out.println(prop.get("Browser"));
		System.out.println(prop.get("Username"));
		*/
		
		//Priting vaues 
		/*String br,us,pwd,baseurl;
		br=getValueFromProperties("Browsername");
		baseurl=getValueFromProperties("url");
		us=getValueFromProperties("Username");
		pwd=getValueFromProperties("Password");
		System.out.println(br+"--"+us+"--"+pwd);*/
		
		//Passing values 

		launchBrowser(getValueFromProperties("Browsername"));
		driver.get(getValueFromProperties("url"));
		driver.manage().window().maximize();
		 driver.findElement(By.id("show-login")).click();
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getValueFromProperties("Username"));
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(getValueFromProperties("Password"));
		  driver.findElement(By.id("signin-okButton")).click();
		  driver.close();
		
		

	}
	
	public static String getValueFromProperties (String key)  throws IOException {
     String filepath = "C:\\Users\\Arun\\workspace\\SeleniumLearning\\src\\LearningSelenium\\Selenuimfile.properties";
		
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	/*public static void launchBrowser (String Browsername){
		switch(Browsername){
		
		case "FF":
		driver=new FirefoxDriver();
		break;
		
		case "Chrome":
		System.setProperty("webdriver.chrome.driver", D:\\SeleniumSoftwares\\chromedriver.exe);
		driver=new ChromeDriver();
		break;
	}
*/
			
	public static void launchBrowser(String BrowserName){
		
		switch(BrowserName){
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

	

