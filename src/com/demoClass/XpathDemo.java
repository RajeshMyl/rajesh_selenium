package com.demoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\SeleniumDemo\\Drive\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//	WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
//	findElement.sendKeys("rajeshmylsamy@gmail.com");
//		
//	WebElement pass = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));	
//		pass.sendKeys("jwqhyefg2");
//		
//		WebElement tex = driver.findElement(By.xpath("//h2[contains(text(),'with')]"));
//		System.out.println(tex);
//		
//		WebElement tamil = driver.findElement(By.xpath("//a[text()='Jobs']"));
//		System.out.println(tamil);
//		
//		WebElement text = driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[2]"));
//		String text2 = text.getText();
//		System.out.println(text2);		
//		
//		driver.close();
		
//		WebDriver name = new ChromeDriver();
//		name.get("https://www.javatpoint.com/java-tutorial");
//		name.manage().window().maximize();
//		
//		WebElement point = name.findElement(By.xpath("//input[@type='text']"));
//		point.sendKeys("java collection");
//	
//	WebElement search = name.findElement(By.xpath(""));
//	search.click();
//	WebElement name1 = name.findElement(By.xpath("//span[contains(text(),'in-java')]"));
//	String print = name1.getText();
//	//System.out.println(print);
//	WebElement img = name.findElement(By.xpath("//img[contains(@alt,'Javatpoint Logo')]"));
//	System.out.println(img.isDisplayed());
//	WebElement element = name.findElement(By.xpath("//span[text()=' › java-collections-interview-questions']"));
//	String a = element.getText();
//	System.out.println(a);
//	name.close();
		
//	WebDriver map = new ChromeDriver();
//	map.get("https://www.google.com/maps/@13.0216205,80.176346,15z");
//	map.manage().window().maximize();
//	WebElement find = map.findElement(By.xpath("//input[@id='searchboxinput']"));
//	find.sendKeys("chrompet");
//	WebElement butt = map.findElement(By.xpath("//button[contains(@guidedhelpid,'searchbu')]"));
//	butt.click();
//	WebElement ser = map.findElement(By.xpath("//span[text()='Chromepet']"));
//	WebElement met = map.findElement(By.xpath("//h2[contains(text(),'Quick')]"));
//	WebElement s = map.findElement(By.xpath("(//span[contains(@jstcache,'814')])[3]"));
//	s.click();
//	map.close();
	
	WebDriver you = new ChromeDriver();
	you.get("https://www.youtube.com/");
	you.manage().window().maximize();
	WebElement tube = you.findElement(By.xpath("//input[@id='search']"));
	tube.sendKeys("java");
	WebElement youtube = you.findElement(By.xpath("//button[contains(@id,'search')]"));
	youtube.click();
	WebElement yt = you.findElement(By.xpath("(//yt-icon[contains(@id,'logo-icon')])[1]"));
	yt.click();
	WebElement ytb = you.findElement(By.xpath("//a[text()='SportsPro']"));
	String xt = ytb.getText();
	System.out.println(xt);
	WebElement yout = you.findElement(By.xpath("//a[contains(text(),'Fox')]"));
	String tt = yout.getText();
	System.out.println(tt);
	you.close();
	}

}
