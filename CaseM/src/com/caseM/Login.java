package com.caseM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Login {
	
	static WebDriver driver;
	
	static constandmathods constd = new constandmathods();
	
	public static void emilTesxtFiledsInHomePage () throws IOException{
		
		constd.launchBrowser(constd.getValuesFromProperties1("Browsername"));
		
		driver.get(constd.getValuesFromProperties1("url"));
	}


	
	}
		
		
	}
		
	


