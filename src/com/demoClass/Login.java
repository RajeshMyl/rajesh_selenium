package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://automationpractice.com/index.php");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1500);
		dr.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rajeshmylsamy007@gmail.com");
		dr.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3500);
		dr.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		dr.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rajesh");
		dr.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("M");
		dr.findElement(By.id("passwd")).sendKeys("rajesh");
		WebElement fe = dr.findElement(By.name("days"));
		Select s = new Select(fe);
		s.selectByValue("19");
		WebElement fe1 = dr.findElement(By.id("months"));
		Select s1 = new Select(fe1);
		s1.selectByValue("3");
		WebElement fe2 = dr.findElement(By.id("years"));
		Select s2 = new Select(fe2);
		s2.selectByValue("1995");
		dr.findElement(By.id("address1")).sendKeys("erode");
		dr.findElement(By.name("city")).sendKeys("Hilo");
		WebElement find = dr.findElement(By.xpath("//select[contains(@name,'state')]"));
		Select se = new Select(find);
		se.selectByValue("11");
		dr.findElement(By.id("postcode")).sendKeys("96720");
		WebElement findElement = dr.findElement(By.xpath("//select[contains(@name,'country')]"));
		Select sel = new Select(findElement);
		sel.selectByVisibleText("United States");
		dr.findElement(By.xpath("(//input[contains(@class,'form-control')])[14]")).sendKeys("9486257109");
		dr.findElement(By.name("alias")).sendKeys("hawaii");
		dr.findElement(By.name("submitAccount")).click();
		
		
	}

}
