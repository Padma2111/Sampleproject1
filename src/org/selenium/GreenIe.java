package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GreenIe {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\IEDriverServer.exe");
		WebDriver dri=new InternetExplorerDriver();
		dri.get("http://demoqa.com/registration/");
		
	}

}
