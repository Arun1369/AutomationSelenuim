import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.DriverClass;
import Pages.SignInPage;
import Utility.AlertBox;

public class SignInTest extends DriverClass {
	SignInPage signin = new SignInPage();
	AlertBox alert = new AlertBox();
	
	
	
	
	@Test
	public void test1() throws InterruptedException
	{
		//String allCV = "";
		signin.login("demo@casem.in", "demo");
		Thread.sleep(5000);
		/*
		driver.findElement(By.id("search-court-filter")).sendKeys("Acc");
		Thread.sleep(500);
		driver.findElement(By.id("search-court")).click();
		Thread.sleep(500)*/;
		
		
		WebElement table = driver.findElement(By.xpath("(//table[@class='table table-striped table-bordered tolcys-table'])[1]/tbody"));
		List <WebElement> row = driver.findElements(By.tagName("tr"));
		row.size();
		//System.out.println("rowsize"+row.size());
		for (int i=0;i<row.size();i++)
		{
			List <WebElement> col = row.get(i).findElements(By.tagName("td"));	
			col.size();
			//System.out.println("col size"+col.size());
			for (int j=0;j<col.size();j++)
			{
				String cv = col.get(j).getText();
				System.out.println(cv);
				//allCV = allCV + "-" + cv;
				
				if(cv.equalsIgnoreCase("Accident Case"))
				{
					String xp1 = "html/body/div[2]/div[3]/div[1]/div/div[2]/div[2]/div/span/div[1]/table/tbody/tr[";  
					             // html/body/div[2]/div[3]/div[1]/div/div[2]/div[2]/div/span/div[1]/table/tbody/tr/td[4]/a[2]/i
					String xp2 = "]/td[4]/a[2]/i";
					driver.findElement(By.xpath(xp1+i+xp2)).click();
					break;
				}		
	        }
			break;
		}
//System.out.println(allCV);
	}
}
/*
@Test
public void validLogin() throws InterruptedException{
	signin.loginToAccount("demo@casem.in", "demo");	
}*/








/*@Test
public void enterEmptyUserNameAndPassword(){
	signin.loginToAccount("", "");
	alert.handlingAlert();
	System.out.println(alert.getAlertText());
	Assert.assertEquals(alert.getAlertText(), "");
	
}*/

/*public void calender(){
	
	while(!getYear().equalsIgnoreCase("1990")){
		driver.findElement(By.xpath("html/body/div[6]/div/div[1]/div[1]/div[3]/div[1]/a/i")).click();	
	}
	//USe web table concespts 
	
	
}

public String getYear(){
	String year = driver.findElement(By.xpath("html/body/div[6]/div/div[1]/div[1]/div[3]/div[2]")).getText();
	return year;
}*/

