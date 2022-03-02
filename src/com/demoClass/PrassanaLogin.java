package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.events.Event.ID;

public class PrassanaLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://automationpractice.com/index.php");
	dr.manage().window().maximize();
	WebElement sig = dr.findElement(By.xpath("//a[@class='login']"));
	sig.click();
	Thread.sleep(2000);
	WebElement email = dr.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[1]"));
	email.sendKeys("prasannashakthi24@gmail.com");
	WebElement creat = dr.findElement(By.id("SubmitCreate"));
	creat.click();
	Thread.sleep(9000);
	WebElement gender = dr.findElement(By.xpath("(//input[@type='radio'])[1]"));
	gender.click();
	WebElement name = dr.findElement(By.xpath("(//input[@type='text'])[2]"));
	name.sendKeys("prasanna");
	WebElement n2 = dr.findElement(By.xpath("(//input[@type='text'])[3]"));
	n2.sendKeys("s");
	WebElement pass = dr.findElement(By.id("passwd"));
	pass.sendKeys("prasanna123");
	WebElement date = dr.findElement(By.id("days"));
	Select s =new Select(date);
	s.selectByValue("6");
	WebElement month = dr.findElement(By.id("months"));
	Select s1=new Select(month);
	s1.selectByVisibleText("October ");
	WebElement year = dr.findElement(By.id("years"));
	Select s3=new Select(year);
	s3.selectByValue("2000");
	WebElement addrss = dr.findElement(By.id("address1"));
	addrss.sendKeys("trichy");
}

}
