package Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basepackage.Driverclass;
import Pages.HomePage;
import Pages.Registerpage;

public class RegisterTest extends Driverclass{
	HomePage homepage = new HomePage();
	Registerpage regpage = new Registerpage();
	
	@Test(groups={"smoke"})
	public  void empptyregister(){
		homepage.clickNewUserRegister();
		//regpage.regnametextfield("arun panangattu");
		//regpage.fullnameTextfield("Arun pv");
		//regpage.mobNotextfield("9901395048");
		
		regpage.clickAddButton();
		String expectederrorMessage = "Full Name is required.e-Mail is required.Mobile Number is required.";//ask doubt for this 
		String actualerrormessage = driver.findElement(By.id("errorMsg")).getText();
		/*try {
			String actualerrormessage	 	
			}
		catch (Exception e){
			System.out.println(e + "errormessge not found");
		}*/
		//Assert.assertEquals(expectederrorMessage, actualerrormessage);
		Assert.assertTrue(actualerrormessage.contains("Full Name is required"));
				
	}
	@Test(groups={"smoke"})
	public void enteringInvalidemailid (){
		homepage.clickNewUserRegister();
		regpage.regnametextfield("fasfasfas");
		regpage.fullnameTextfield("Arun pv");
		regpage.mobNotextfield("9901395048");
		regpage.clickAddButton();
		String expectederrormessage1 = "e-Mail is an invalid email address.";
		String actualerrormessage1 = driver.findElement(By.id("errorMsg")).getText();
		System.out.println(actualerrormessage1);
		Assert.assertEquals(actualerrormessage1, expectederrormessage1);		
	}
	@Test(groups={"smoke"})
	public void missingFullname () {
		homepage.clickNewUserRegister();
		regpage.regnametextfield("arun@sunfra.com");
		regpage.mobNotextfield("9901395048");
		regpage.clickAddButton();
		String expectederrormessage = "Full Name is required.";
		String actualerrormessage = driver.findElement(By.id("errorMsg")).getText();
		System.out.println(actualerrormessage);
		Assert.assertEquals(actualerrormessage, expectederrormessage);
		
	}
	@Test(groups={"smoke"})
	public void missingMobileno(){
		homepage.clickNewUserRegister();
		regpage.regnametextfield("arun@sunfra.com");
		regpage.fullnameTextfield("Arun pv");
		regpage.clickAddButton();
		String expectederrormessage = "Mobile Number is required.";
		String actualerrormessage = driver.findElement(By.id("errorMsg")).getText();
		System.out.println(actualerrormessage);
		Assert.assertEquals(actualerrormessage, expectederrormessage);	
	}
	@Test(groups={"smoke"})
	public void invalidMobienumber(){
		homepage.clickNewUserRegister();// do we need to enter this step on all methosds
		regpage.regnametextfield("arun@sunfra.com");
		regpage.fullnameTextfield("Arun pv");
		regpage.mobNotextfield("ggggg");
		regpage.clickAddButton();
		String expectederrormessage1 = "Mobile Number can not be less than 10 characters.";
		String actualerrormessage1 = driver.findElement(By.id("errorMsg")).getText();
		System.out.println(actualerrormessage1);
		Assert.assertEquals(actualerrormessage1, expectederrormessage1);
	}
	@Test(groups={"smoke"})
	public void existingEmailId(){
		homepage.clickNewUserRegister();
		regpage.regnametextfield("arun.vijeesh396@gmail.com");
		String expectederrormessage1 = "e-Mail is already exists! Please enter different value.";
		String actualerrormessage1 = driver.findElement(By.id("mailErrId")).getText();
		System.out.println(actualerrormessage1);
		Assert.assertEquals(actualerrormessage1, expectederrormessage1);			
	}
	

}
