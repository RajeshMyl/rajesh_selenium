package com.demoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Throw;

public class BasicDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.hotstar.com/in");
	
	driver.manage().window().maximize();
	driver.get("https://www.primevideo.com/");
	String title = driver.getTitle();
	System.out.println("title of the page" + title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("URL of current page"+ currentUrl);
	
	driver.navigate().to("https://www.primevideo.com/");
	Thread.sleep(7000);
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	
	driver.close();
	
	
	
	
}
}
