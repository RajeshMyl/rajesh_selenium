package com.demoClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable_Incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("incognito");
		
		WebDriver dr = new ChromeDriver(co);
		dr.manage().window().maximize();
		
		dr.get("https://www.google.co.in/");
		dr.switchTo().activeElement().sendKeys("https://www.timeanddate.com/calendar/monthly.html?year=2022&month=3&country=35");
		dr.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		dr.findElement(By.xpath("//h3[contains(text(),'March')]")).click();
		
		List<WebElement> all = dr.findElements(By.xpath("(//table)[3]/tbody/tr/td"));
		for (WebElement march : all) {
			System.out.print("All data.........."+march.getText());
		}
		List<WebElement> row = dr.findElements(By.xpath("(//table)[3]/tbody/tr[3]/td"));
		for (WebElement rw : row) {
			System.out.println("Row........"+rw.getText());
		}
		List<WebElement> column = dr.findElements(By.xpath("(//table)[3]/tbody/tr/td[7]"));
		for (WebElement clmn : column) {
			System.out.println("coloumn........"+clmn.getText());
		}
		WebElement parti = dr.findElement(By.xpath("(//table)[3]/tbody/tr[3]/td[7]"));
		System.out.println("Particular....."+parti.getText());

		WebElement head = dr.findElement(By.xpath("(//table)[2]/tbody/tr/th"));
		System.out.println("Head......."+head.getText());
		
		dr.close();
		
	}

}
