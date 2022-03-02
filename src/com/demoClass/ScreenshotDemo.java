package com.demoClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("(//button)[2]")).click();
	//Thread.sleep(3000);
	TakesScreenshot t = (TakesScreenshot) driver;
	File start = t.getScreenshotAs(OutputType.FILE);
	File end = new File("C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Screenshot\\pic1.png");
	
	FileUtils.copyFile(start, end);
	
	//FileHandler.copy(start, end);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
