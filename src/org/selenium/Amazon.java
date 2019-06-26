package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\geckodriver(1).exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.amazon.com/");
		dr.manage().window().maximize();
		String url = dr.getCurrentUrl();
		System.out.println(url);
		String t = dr.getTitle();
		System.out.println(t);
		dr.quit();
}
}
