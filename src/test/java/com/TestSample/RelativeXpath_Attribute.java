package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpath_Attribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement  -- Relative xpath -- Xpath By Attribute 
		//tagname[@attribute name='attribute value']		
//WebElement element=driver.findElement(By.xpath("//tagname[@attribute name='attribute value']"));
		
	WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));	
	Email.sendKeys("Test");
	
	WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
	Password.sendKeys("12345678");
	
	
	
	}

}
