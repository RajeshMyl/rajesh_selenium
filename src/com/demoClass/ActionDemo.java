package com.demoClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://www.leafground.com/");
	dr.manage().window().maximize();
	WebElement findElement = dr.findElement(By.xpath("(//a[contains(@class,'max')])[25]"));
	Actions a = new Actions(dr);
	a.moveToElement(findElement).build().perform();
	a.click().build().perform();
	WebElement fe = dr.findElement(By.xpath("//img"));
	a.moveToElement(fe).build().perform();
	a.contextClick().build().perform();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	dr.quit();
	
	
}
}
