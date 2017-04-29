package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BasePackage.DriverClass;

public class ActionsClass extends DriverClass {
	
	
	public void handlingActions(WebElement element){  // Ask doubts here 
	Actions act=new Actions (driver);
	act.moveToElement(element).build().perform();
}	

}
