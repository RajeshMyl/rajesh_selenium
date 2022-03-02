package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("arkhjyblug@gmail.com");
	
	WebElement findElement2 = driver.findElement(By.name("pass"));
	findElement2.sendKeys("rajesh");
	
	WebElement findElement3 = driver.findElement(By.name("login"));
	
	findElement3.click();
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
	
}
}
