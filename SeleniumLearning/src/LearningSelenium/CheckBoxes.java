package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in/oprs-web/login/show.do");
		
		/*WebElement termandconditionchekbox = driver.findElement(By.id("TermsConditions"));
		if (termandconditionchekbox.isSelected()){
			System.out.println("Term and Condition selected");
		}
		else {
			termandconditionchekbox.click();
			
		}
		
		*/
		
		WebElement termscondition = driver.findElement(By.id("TermsConditions"));
		 termsandconditionDropdown (termscondition,"TermsConditions");
		
	}
	
	public static  void termsandconditionDropdown (WebElement element, String valueToslect) {
		if (element.isSelected()){
			System.out.println("Term and Condition selected");
		}
		else {
			element.click();
			}
		
	}

}
