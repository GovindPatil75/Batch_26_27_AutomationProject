package com.Testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionTestng_assert {
	
	@Test
	public void TC_001() {
		
		System.out.println("Browser open");
		System.out.println("Email send");
		System.out.println("password send");
		System.out.println("Click Login Button");
		
		String ExpectedTitle="ABC";
		String ActualTitle="PQR";
		//verify 
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		System.out.println("Welcome to HomePage");
		
	}
	
	@Test
	public void verifyLogin() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		
		String ExpectedMsgonAlert="Do you really want to delete ";
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String ActualmsgonAlert=driver.switchTo().alert().getText();
		System.out.println(ActualmsgonAlert);
		//Do you really want to delete this Customer?
		
		//Verify 
		Assert.assertEquals(ActualmsgonAlert, ExpectedMsgonAlert);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
	}

}
