package com.demoClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a)[6]")).click();
		WebElement dp = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(dp);
		
		s.selectByVisibleText("Selenium");
		s.selectByValue("4");
		s.selectByIndex(2);
	//	s.deselectAll();
		s.deselectByIndex(2);
		
		List<WebElement> options = s.getOptions();
		for (WebElement we : options) {
			System.out.println(we.getText());
		}
		System.out.println("................................................");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}System.out.println(".......................................................");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		driver.close();
		
		
		
	}

}
