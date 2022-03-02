package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsaluteXpathDemo {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button)[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivobook 15");	
	driver.findElement(By.xpath("//button")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("#container > div > div._36fx1h._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div:nth-child(2) > div:nth-child(2) > div > div > div > a > div.MIXNux > div._2QcLo- > div > div > img")).click();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
