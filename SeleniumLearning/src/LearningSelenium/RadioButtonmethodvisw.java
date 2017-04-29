package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonmethodvisw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		/*WebElement femaleRadioButton = driver.findElement(By.id("u_0_h"));
		
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
*/	
		WebElement female = driver.findElement(By.id("u_0_h"));
		femaleRadiobutton(female,"u_0_h");
		
	
		WebElement male = driver.findElement(By.id("u_0_i"));
		maleDropdown(male,"u_0_i");
		

		
		
	}

		public static void femaleRadiobutton (WebElement element, String valueToselect){
			if (element.isSelected()){
				System.out.println("femaleRadionButton already selected");
			}
			else {
				element.click();
			}
			
		}
		
		public static void maleDropdown (WebElement element, String valueToselect) {
			if (element.isSelected()){
				System.out.println("male radio button is already selected");
				
			}
			else {
				element.click();
			}
			
		}


		}
		
	
	
