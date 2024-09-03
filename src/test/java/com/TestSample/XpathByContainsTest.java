package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByContainsTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		// Element Xpath By Contains()
		//tagname[contains(@attributename,'attribute static partial value')]
		//tagname[contains(text(),'partial value ')]
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		
	   Thread.sleep(5000);
	   WebElement loginBtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_9')]"));
	   loginBtn.click();
	
	//WebElement FP=driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')] "));
	//FP.click();
	
	
	}

}
