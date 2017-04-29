package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePackage.DriverClass;

public class CasemDropDowns  extends DriverClass {
	
	public void selectValueByVisibleText(WebElement element, String valueToSet){
		Select select = new Select (element);
		select.selectByVisibleText(valueToSet);	
	}
	public void selectValueByValue(WebElement element, String valueToSet){
		Select select = new Select (element);
		select.selectByValue(valueToSet);
	}
	public void selectVAlueByIndex(WebElement element, int no){
		Select select = new Select (element);
		select.selectByIndex(no);
	}

}
