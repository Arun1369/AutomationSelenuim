package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {
	public static WebDriver driver;
	
	public String caseMValuesFromPropertiesValues(String key) throws IOException{
		String FilePath = System.getProperty("user.dir")+"\\src\\main\\java\\Config\\CaseM.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(FilePath);
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	
	public void luncnBrowser(String Browsername) throws IOException{
		switch (Browsername){
		case "FF":
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\java\\Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			break;	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(caseMValuesFromPropertiesValues("url"));
		
		
	}
}
