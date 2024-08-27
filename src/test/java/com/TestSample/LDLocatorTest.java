package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LDLocatorTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify WebElement -- Locator -- ID
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Test@gmail.com");
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("12345678");
		
		//WebElement LoginButton=driver.findElement(By.id("u_0_9_aE"));
		//LoginButton.click();
		
		//Identify WebElement -- Locator -- Name 
		WebElement LoginButton=driver.findElement(By.name("login"));
		LoginButton.click();
		
	}

}
