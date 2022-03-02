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

public class WindowsHandilingDemo {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver dr =new ChromeDriver();
	dr.get("https://www.youtube.com/");
	dr.manage().window().maximize();
	Thread.sleep(3000);
	WebElement ex = dr.findElement(By.id("endpoint"));
	
	Actions a = new Actions(dr);
	a.contextClick(ex).build().perform();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement si = dr.findElement(By.xpath("(//tp-yt-paper-button[@role='button'])[2]"));
	a.contextClick(si).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement hi = dr.findElement(By.id("endpoint"));
	a.contextClick(hi).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
		Set<String> wh = dr.getWindowHandles();
	for (String st : wh) {
		String title = dr.switchTo().window(st).getTitle();
		System.out.println(title);
	}
}
}
