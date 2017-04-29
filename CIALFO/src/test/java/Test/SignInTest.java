package Test;

import org.openqa.selenium.By;import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Basepackage.Driverclass;
import Pages.HomePage;
import Pages.SignInPage;
import junit.framework.Assert;

public class SignInTest extends Driverclass{
	
	HomePage homepage = new HomePage();
	SignInPage signinpage = new SignInPage();
	
	@Test(groups={"smoke"})
	
	public void validsignin(){
		homepage.clickSignIn();
		signinpage.enterUserName("arun.vijeesh396@gmail.com");
		signinpage.enterPassword("Nichi@123");
		signinpage.clickLoginButton();	
		String expectedurl = "http://www.ksrtc.in/oprs-web/guest/home.do?h=1";
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(expectedurl, currenturl);
		signinpage.clickLoggedoutbutton();
	}
	
	@Test(groups={"smoke"})
	public void xnvalidlogin(){
		homepage.clickSignIn();
		signinpage.enterUserName("arun.vijeegggsh396@gmail.com");
		signinpage.enterPassword("Nichi@123");
		signinpage.clickLoginButton();	
		String expectedurl = "Login incorrect. Please try again";
		String currenturl = driver.findElement(By.id("errorMsg")).getText();
		Assert.assertEquals(expectedurl, currenturl);
		
	}
	
	

}
