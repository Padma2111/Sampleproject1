package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		WebElement u = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		u.sendKeys("Padmavathi");
		WebElement p = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		p.sendKeys("Padma");
		}	
	}









