package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement u = driver.findElement(By.id("username"));
		u.sendKeys("Padmavathi");
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("Padma");		
	}
}