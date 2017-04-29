package Pages;

import org.openqa.selenium.By;

import BasePackage.DriverClass;

public class HomePage extends DriverClass {
	
	private By Homeicon  					=  By.partialLinkText("Home");
	private By Current 						=  By.partialLinkText("current");
	private By Quick						=  By.partialLinkText("quick");
	private By Power 						=  By.xpath("(//a [@class='dropdown-toggle remark'])[1]");
	private By ContactsEntry				=  By.xpath("//a[@href='/power/create']");
	private By TasksEntry					=  By.partialLinkText("Tasks Entry");
	private By Actions 						=  By.xpath("(//a [@class='dropdown-toggle remark'])[2]");
	private By LegalProcess					=  By.partialLinkText("Legal Process");
	private By Petitions 					=  By.partialLinkText("Petitions");
	private By Minutes						=  By.partialLinkText("Minutes");
	private By Base 						=  By.xpath("(//a [@class='dropdown-toggle remark'])[3]");
	private By Documennts 					=  By.partialLinkText("Documents");
	private By Comments 					=  By.partialLinkText("Comments");
	private By Locations    				=  By.partialLinkText("Locations");
	private By History						=  By.partialLinkText("History");
	private By TaskType 					=  By.partialLinkText("Task Type");
	private By Costs 						=  By.xpath("(//a [@class='dropdown-toggle remark'])[4]");
	private By Costs1						=  By.partialLinkText("Costs");
	private By Honorary						=  By.partialLinkText("Honorary");
	private By CostdistributionperCase	    =  By.partialLinkText("Cost distribution per Case");
	private By Charts 						=  By.xpath("(//a [@class='dropdown-toggle remark'])[5]");
	private By HonorarydistributionperCase  =  By.partialLinkText("Honorary distribution per Case");
	private By TopPaid						=  By.partialLinkText("Top Paid");
	private By TopUnpaid					=  By.partialLinkText("Top Unpaid");
	private By TopTotals					=  By.partialLinkText("Top Totals");
	private By Dashboard					=  By.partialLinkText("Dashboard");
	private By Cases						=  By.partialLinkText("Cases");
	private By Contacts						=  By.partialLinkText("Contacts");
	private By Tasks						=  By.partialLinkText("Tasks");
	
	public void clickHomeOption (){
		driver.findElement(Homeicon).click();
	}
	public void clickOnCurrentOption(){
		driver.findElement(Current).click();
	}
	public void clickOnQuickOption(){
		driver.findElement(Quick).click();
	}
	public void clickOnCasesOption(){
		driver.findElement(Cases).click();
	}
	public void clickOnContactsOption(){
		driver.findElement(Cases).click();
	}
	public void clickOnTasksOption(){
		driver.findElement(Tasks).click();
	}

}
