package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
		WebElement i = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		i.sendKeys("padmavathi");
		WebElement p = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		p.sendKeys("padmavathi");
		System.out.println("padma");
		driver.quit();
}

}
