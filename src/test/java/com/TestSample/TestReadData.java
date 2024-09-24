package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestReadData {

	public static void main(String[] args) throws Exception {

   WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://demo.guru99.com/test/newtours/register.php");
   driver.manage().window().maximize();
   
   String Name=Library.getExcelTestData("Sheet2", 0, 0);
   System.out.println(Name);
   
   WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
   FirstName.sendKeys(Name)	;
   
   WebElement LastName=driver.findElement(By.xpath("//input[@name='lastName']"));
   LastName.sendKeys(Library.getExcelTestData("Sheet2", 0, 1));
	
	String Data=Library.getExcelTestData("Sheet2", 0, 4);
	System.out.println(Data);
	
	String Data1=Library.getExcelTestData("Sheet2", 0, 6);
	System.out.println(Data1);
	}

}
