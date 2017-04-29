package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basepackage.Driverclass;

public class FileUploder extends Driverclass {
	
	@Test(groups={"smoke"})
	public void fileUploader() throws InterruptedException, IOException{
		driver.findElement(By.id("uploadname1")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\SeleniumSoftwares\\Autoie.exe");
		
		
	}
}



/*
Downloaf Autoie > Download > Exe file >  Extract > GO to SCiTE >  RUN SCITE 

enter scrpit 

WinWaitActive("Open")
Send("D:\Book1.xlsx")
Send("{ENTER}")

save 
 GO TO save script folder > and compile > and copy the pth */