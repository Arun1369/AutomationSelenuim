package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Basepackage.Driverclass;

public class HomePage extends Driverclass {
	
	By SignIn			= By.linkText("Sign In");
	By NewUserRegister  = By.linkText("New User Register");
	By fromPlace		= By.id("fromPlaceName");
	By Toplace 			= By.id("toPlaceName");
	By JouDate 			= By.id("txtJourneyDate");
	By JouDatevalue		= By.xpath("(//a[@class='ui-state-default'])[1]");
	By ReturnjoouDate	= By.id("txtReturnJourneyDate");
	//WebElement ladycheckbox		= (WebElement) By.id("singleLady");//This Check box, should we declard as check box 
	By Popularsearch 	= By.linkText("Bengaluru - Ernakulam");
	By Popularsearch1   = By.linkText("KIAL - Mysuru ");
	By SearchButton 	= By.id("searchBtn");
	By PNREnquiry 		= By.xpath("//a[@title='PNR Enquiry']");
	By clickCancelTickets    = By.partialLinkText("Cancel Tickets");
	//String searchkey = "BANGALORE";
	
	
	public void clickCancelTickets(){
		driver.findElement(clickCancelTickets).click();
	}
	public void clickSignIn(){
		driver.findElement(SignIn).click();
	}
	
	public void clickNewUserRegister(){
		driver.findElement(NewUserRegister).click();
	}
	
	public void enterFromPlace(String value){
		driver.findElement(fromPlace).sendKeys(value);	
	}
	public void actionselctor(WebElement searchkey){
		Actions act=new Actions (driver);
		act.moveToElement(searchkey).build().perform();
	}
	public static  void singleladychkbox (WebElement element, String valueToslect) {
		if (element.isSelected()){
			System.out.println("Term and Condition selected");
		}
		else {
			element.click();
			}

}
	public void popularSearch(String value){
		driver.findElement(By.linkText(value)).click();
		
	}
	public void clickPNRstatusoption (){
		driver.findElement(PNREnquiry).click();
	}

		
	}

