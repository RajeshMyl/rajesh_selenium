package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Lotus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		WebElement fe = dr.findElement(By.id("email"));
		fe.sendKeys("lotus");
		boolean enabled = fe.isEnabled();
		System.out.println(enabled);
		boolean displayed = fe.isDisplayed();
		System.out.println(displayed);
		
		WebElement findElement = dr.findElement(By.id("pass"));
		findElement.sendKeys("hfugi");
		
//		WebElement lo = dr.findElement(By.name("login"));
//		lo.click();
		String text = fe.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
