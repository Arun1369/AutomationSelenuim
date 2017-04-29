package Utility;

import org.openqa.selenium.Alert;

import BasePackage.DriverClass;
import junit.framework.Assert;

public class AlertBox extends DriverClass  {
	
	Alert al;
	
	public void handlingAlert(){
	al = driver.switchTo().alert();
	System.out.println("alertmessage is"+al.getText());
	String alertmsg = al.getText();
	al.accept();
	Assert.assertEquals(alertmsg, "Plase enter valid email and password");// ask dount 
}
	public String getAlertText(){
		al = driver.switchTo().alert();
		return al.getText();
	}
}