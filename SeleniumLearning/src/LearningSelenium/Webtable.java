package LearningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		// TODO Auto-generated method stub
		
		WebElement table = driver.findElement(By.xpath("//div[@id ='content']/table"));
		/*List <WebElement> head = driver.findElements(By.tagName("th"));
		head.size();
		
		for (int h=0;h<head.size();h++){*/
		List <WebElement> row = driver.findElements(By.tagName("tr"));
		row.size();
		
	
		for (int i=0;i<row.size();i++){
			
			
				
			List <WebElement> col = row.get(i).findElements(By.tagName("td"));
			col.size();
			
		
			for (int j=0;j<col.size();j++){
				String cv = col.get(j).getText();
				if(cv.equalsIgnoreCase("Saudi Arabia")){
					String xp1 = "html/body/div[1]/div[5]/div[2]/div/div/table/tbody/tr[";
					String xp2 = "]/td[6]";
					driver.findElement(By.xpath(xp1+i+xp2)).click();
				}
				System.out.println(cv);
			}
				
		
			
		}
		
		

	}
	
	
	public void selectGroupStatus(String expGroupStatusValue){
		
		WebElement groupStatus = driver.findElement(By.xpath("//ul [@for='groupstatus']"));
		
		List<WebElement> groupStatusItems = groupStatus.findElements(By.tagName("li"));
		
		for(int i=0; i<=groupStatusItems.size();i++){
			String actVal = groupStatusItems.get(i).getText();
			if(actVal.equalsIgnoreCase(expGroupStatusValue)){
				groupStatusItems.get(i).click();
				break;
			}
		}
		
		public void selecrMembers(String memberName){
			WebElement memberslist  = driver.findElement(By.xpath("//div[@class='tt-dataset tt-dataset-players']"));
			
			List <WebElement> mem = memberslist.findElements(By.tagName("div"));
			for (int i=0;i<=mem.size();i++){
				String memenameall = mem.get(i);
				
			}
		}
	}
}


