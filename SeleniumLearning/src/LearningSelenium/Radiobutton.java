package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		WebElement femaleRadioButton = driver.findElement(By.id("u_0_h"));
		
		if (femaleRadioButton.isSelected()){
			System.out.println("femaleRadionButton already selected");
		}
		else {
			femaleRadioButton.click();
		}
		
		WebElement maleRadioButton = driver.findElement(By.id("u_0_i"));
		if (maleRadioButton.isSelected()){
			System.out.println("maleRadio button already selected");
			
		}
		else {
			maleRadioButton.click();
			
		}
	}
	
	

}
