package Basepackage;

import java.io.IOException;

import org.testng.annotations.*;

public class BaseClass extends Driverclass {
	
	Driverclass driverclass = new Driverclass();
	
	@BeforeSuite(groups = {"smoke"})
	public void launchAUT() throws IOException
	{
		driverclass.launchBrowser(driverclass.getValuesFromPropertiesFile("Browsername"));
	}
	
	@AfterSuite(groups = {"smoke"})
	public void cleanUp(){
		driver.close();
	}
}
