package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Padma\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("(//i[@id='i-icon-profile'])"));
		f.click();
		WebElement t = driver.findElement(By.xpath("(//li[@id='signInLink'])"));
		t.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement t1 = driver.findElement(By.xpath("(//button[@class='buttonText  fb-loaded'])"));
		t1.click();		
}
}
