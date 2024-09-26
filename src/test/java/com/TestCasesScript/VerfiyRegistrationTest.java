package com.TestCasesScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageObjectRepo.RegistrationPageElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerfiyRegistrationTest {

	public static void main(String[] args) {
		
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.guru99.com/test/newtours/register.php");
      driver.manage().window().maximize();
      
      //Element identify 
      RegistrationPageElement register=PageFactory.initElements(driver, RegistrationPageElement.class);
      
      register.getFirstname().sendKeys("Test");
      register.getLastName().sendKeys("Test");
      register.getPhone().sendKeys("12345678");
      register.getEmail().sendKeys("Test@gmail.com"); 
      
	}

}
