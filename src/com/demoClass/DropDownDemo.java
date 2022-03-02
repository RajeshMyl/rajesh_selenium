package com.demoClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("SELECTOR_1"));
		Select s = new Select(month);
		s.selectByVisibleText("March");
		WebElement date = driver.findElement(By.id("SELECTOR_2"));
		Select s1 = new Select(date);
		s1.selectByValue("19");
		WebElement year = driver.findElement(By.id("SELECTOR_3"));
		Select s2 = new Select(year);
		s2.selectByIndex(27);
		
		System.out.println(s2.isMultiple());
		List<WebElement> options = s2.getOptions();
		for (WebElement we : options) {
			String text = we.getText();
			System.out.println(text);
		}
		
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		
		
		
		
	}

}
