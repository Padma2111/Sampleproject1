package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement c = driver.findElement(By.xpath("(//a[text()='CONTACT US'])"));
		c.click();
		WebElement n = driver.findElement(By.id("InputName"));
		n.sendKeys("padma");
		WebElement e = driver.findElement(By.id("InputEmail1"));
		e.sendKeys("padma2194@gmail.com");
		WebElement m = driver.findElement(By.id("InputSubject"));
		m.sendKeys("965953");
		WebElement co = driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
		co.sendKeys("Selenium");
		WebElement b = driver.findElement(By.name("branch"));
		b.sendKeys("OMR");
		WebElement t = driver.findElement(By.name("time"));
		t.sendKeys("Immediately");
		WebElement na = driver.findElement(By.name("comments"));
		na.sendKeys("good");
		
		
}
}