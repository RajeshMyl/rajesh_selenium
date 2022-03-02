package com.demoClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handiling {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.flipkart.com/");
	dr.manage().window().maximize();
	
	dr.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
	WebElement fe = dr.findElement(By.xpath("(//img[contains(@class,'_396cs4 _3exPp9')])[1]"));
	Actions a = new Actions(dr);
	a.contextClick(fe).build().perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement fe1 = dr.findElement(By.xpath("(//img[contains(@class,'_396cs4 _3exPp9')])[2]"));
	a.contextClick(fe1).perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement fe2 = dr.findElement(By.xpath("//img[@alt='Electronics']"));
	a.contextClick(fe2).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Set<String> handles = dr.getWindowHandles();
	
	for (String st : handles) {
		String title = dr.switchTo().window(st).getTitle();
		System.out.println(title);
	}
	String st ="Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
for (String de : handles) {
	if (dr.switchTo().window(de).getTitle().equals(st)) {
		//continue;
		break;
	}else {
		dr.close();
	}
}
System.out.println("----------------------");
	Set<String> set = dr.getWindowHandles();
	for (String bal : set) {
		Thread.sleep(3000);
		String ti = dr.switchTo().window(bal).getTitle();
		System.out.println(ti);
	}
	
	dr.quit();
	
	
	
	
	
	
	
}
}
