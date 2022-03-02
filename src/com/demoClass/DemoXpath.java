package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class DemoXpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	
	drive.get("https://www.facebook.com/");
	drive.manage().window().maximize();
	
	WebElement findElement = drive.findElement(By.xpath("//input[@id='email']"));
	findElement.sendKeys("mdishmdzfg@gmail.com");
	String attribute = findElement.getAttribute("value");
	System.out.println(attribute);
	
	boolean displayed = findElement.isDisplayed();
	System.out.println(displayed);
	
	boolean enabled = findElement.isEnabled();
System.out.println(enabled);
	
	WebElement findElement2 = drive.findElement(By.xpath("//input[@type='password']"));
	findElement2.sendKeys("yfky7ro8yy");
	
	WebElement findElement3 = drive.findElement(By.xpath("//button[@name='login']"));
	findElement3.click();
	
	drive.close();
	
	
	
}
}
