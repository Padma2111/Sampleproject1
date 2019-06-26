package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.facebook.com/");
	dr.manage().window().maximize();
	String url = dr.getCurrentUrl();
	System.out.println(url);
	String t = dr.getTitle();
	System.out.println(t);
	WebElement n = dr.findElement(By.xpath("(//input[@type='email'])"));
	n.sendKeys("Padmavathi");
	WebElement p = dr.findElement(By.xpath("(//input[@id='pass'])"));
	p.sendKeys("padma");
	WebElement l = dr.findElement(By.xpath("(//input[@value='Log In'])"));
	l.click();
}
}
