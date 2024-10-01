package com.Testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionTestng_2 {

	WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch(){
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyRegistartiontest() {
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test");
		
	}
	
	@Test
	public void verifyRegistartiontest1() {
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test");
		
	}
	
	@Test
	public void verifyRegistartiontest2() {
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
