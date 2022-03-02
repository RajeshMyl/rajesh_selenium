package com.demoClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAlert {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@href='pages/Alert.html']")).click();
	driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	Alert al = driver.switchTo().alert();
	Thread.sleep(2000);
	al.accept();
	
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	alert.dismiss();
	
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	 Alert alert2 = driver.switchTo().alert();
	String text = alert2.getText();
	System.out.println(text);
	alert2.sendKeys("rajesh");
	alert2.accept();
	Thread.sleep(2000);

driver.close();	
	
	
	
	
	
	
	
}
}
