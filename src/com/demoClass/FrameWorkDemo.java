package com.demoClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWorkDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://demo.automationtesting.in/Frames.html");
	dr.manage().window().maximize();
	
	dr.switchTo().frame("singleframe");
	WebElement fe = dr.findElement(By.xpath("(//input[@type='text'])[1]"));
	fe.sendKeys("rajesh");
	dr.switchTo().defaultContent();
	dr.findElement(By.xpath("//a[@href='#Multiple']")).click();
	
	WebElement fe1 = dr.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	dr.switchTo().frame(fe1);
	WebElement fe2 = dr.findElement(By.xpath("//iframe[contains(@style,'float: left;height: 250px;width: 400px')]"));
	dr.switchTo().frame(fe2);
	dr.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("rajes");
	dr.switchTo().defaultContent();
	dr.findElement(By.xpath("//a[text()='Practice Site']")).click();
	dr.close();
}
}
