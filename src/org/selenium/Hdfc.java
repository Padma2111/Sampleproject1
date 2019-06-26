package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		WebElement u = driver.findElement(By.xpath("(//input[@placeholder='From*'])"));
		u.sendKeys("madurai");
		WebElement p = driver.findElement(By.xpath("(//input[@placeholder='To*'])"));
		p.sendKeys("chennai");
			
	}
}



