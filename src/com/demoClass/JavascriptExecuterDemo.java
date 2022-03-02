package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuterDemo {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");	
	WebDriver dr = new ChromeDriver();
	
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	
	JavascriptExecutor ts = (JavascriptExecutor) dr;
	WebElement fe = dr.findElement(By.xpath("//a[contains(@href,'amazon.sg')]"));
	
	ts.executeScript("arguments[0].scrollIntoView();",fe);
	Thread.sleep(1500);
	
	ts.executeScript("window.scrollBy(0	, -2500)");
	Thread.sleep(1500);
	
	ts.executeScript("window.scrollBy(0, 1000)");
	Thread.sleep(1500);
	
	dr.close();
	
	
}
}
