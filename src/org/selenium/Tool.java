package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(" http://toolsqa.com/automation-practice-form/");
	dr.manage().window().maximize();
	String url = dr.getCurrentUrl();
	System.out.println(url);
	String t = dr.getTitle();
	System.out.println(t);
	WebElement n = dr.findElement(By.xpath("(//input[@name='firstname'])"));
	n.sendKeys("Kubendra");
	WebElement p = dr.findElement(By.xpath("(//input[@name='lastname'])"));
	p.sendKeys("pandi");
	WebElement l = dr.findElement(By.xpath("(//input[@type='radio'])[1]"));
	l.click();
	WebElement e = dr.findElement(By.xpath("(//input[@type='radio'])[5]"));
	e.click();
	WebElement d = dr.findElement(By.xpath("(//input[@type='text'])[6]"));
	d.sendKeys("21-11-2000");
	WebElement m = dr.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	m.click();
	WebElement s = dr.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
	s.click();
	WebElement co = dr.findElement(By.xpath("(//select[@class='input-xlarge'])[1]"));
	co.sendKeys("Asia");
	WebElement se = dr.findElement(By.xpath("(//select[@class='input-xlarge'])[2]"));
	se.click();
	WebElement btn = dr.findElement(By.xpath("(//button[@class='btn btn-info'])"));
	btn.click();
	dr.quit();	
}
}
