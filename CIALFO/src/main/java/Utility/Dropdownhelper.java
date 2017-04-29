package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhelper {
	Select select ;
	
	public void selectByVisibleText (WebElement element, String valuetoselect){
		select = new Select (element);
		select.selectByVisibleText(valuetoselect);		
	}
	
	public void selectByValue (WebElement element,String valuetoselect){
		select = new Select (element);
		select.selectByValue(valuetoselect);		
	}
	public void selectByIndex (WebElement element,int valuetoselect){
		select = new Select(element);
		select.selectByIndex(valuetoselect);
		
	}

}
