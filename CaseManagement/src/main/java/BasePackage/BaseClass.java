package BasePackage;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass extends DriverClass{
	DriverClass driverclass = new DriverClass();
	
	
	
	@BeforeSuite(groups = {"smoke"})
	public void launchAUT() throws IOException{
		driverclass.luncnBrowser(driverclass.caseMValuesFromPropertiesValues("Browsername"));
		
	}
	
	@AfterSuite(groups = {"smoke"})
	public void cleanUp(){
		//driver.close();
	}

}
