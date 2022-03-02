package com.demoClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	dr.get("http://automationpractice.com/index.php");
	dr.manage().window().maximize();
	
	dr.findElement(By.xpath("//a[@class='login']")).click();
	
	dr.findElement(By.id("email")).sendKeys("rajeshmylsamy007@gmail.com");
	dr.findElement(By.name("passwd")).sendKeys("rajesh");
	dr.findElement(By.id("SubmitLogin")).click();
	
	dr.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
	
	Actions a = new Actions(dr);
	
	JavascriptExecutor ts = (JavascriptExecutor) dr;
	ts.executeScript("window.scrollBy(0, 800)");
	
	WebElement fe = dr.findElement(By.xpath("//img[@itemprop='image']"));
	a.moveToElement(fe).build().perform();
	dr.findElement(By.xpath("//span[text()='Quick view']")).click();
	
	WebElement fr = dr.findElement(By.xpath("//iframe"));
	dr.switchTo().frame(fr);
	WebElement sz = dr.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
	
	Select s = new Select(sz);
	s.selectByIndex(1);
	dr.findElement(By.name("Submit")).click();
	dr.switchTo().defaultContent();
	
	Thread.sleep(5000);
	dr.findElement(By.xpath("//header[@id='header']/div[3]/div/div/div[4]/div/div[2]/div[4]/a")).click();
	
	WebElement plusbutton = dr.findElement(By.xpath("(//a[@rel='nofollow'])[8]"));
	for (int i = 0; i <=7; i++) {
		plusbutton.click();
	}
	
	WebElement scrolldown = dr.findElement(By.xpath("//a[@title='Our stores']"));
	ts.executeScript("arguments[0].scrollIntoView();",scrolldown);
	dr.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	
	WebElement scroll = dr.findElement(By.xpath("//a[text()='My account']"));
	ts.executeScript("arguments[0].scrollIntoView();", scroll);
	dr.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
	
	Thread.sleep(5000);
	dr.findElement(By.xpath("//label[@for='cgv']")).click();
	dr.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	dr.findElement(By.className("cheque")).click();
	
	ts.executeScript("window.scrollBy(0, 500)");
	dr.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
	
	TakesScreenshot t = (TakesScreenshot) dr;
	File screen = t.getScreenshotAs(OutputType.FILE);
	File shot = new File("C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Screenshot\\miniproject.png");
	FileUtils.copyFile(screen, shot);
	
	dr.close();
}
}
