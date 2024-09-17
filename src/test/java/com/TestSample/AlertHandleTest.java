package com.TestSample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//Alert handle 
		
	WebElement CustID=driver.findElement(By.xpath("//input[@name='cusid']"));
	CustID.sendKeys("12345678");
	
	WebElement Submit=driver.findElement(By.xpath("//input[@name='submit']"));
	Submit.click();
	
	//Switch to Alert
	
	//Library.handleAlert(driver).getText();
	//Library.handleAlert(driver).accept();
	
	
	Alert alt=driver.switchTo().alert();
	
	String text=alt.getText();
	System.out.println(text);
	
	//alt.dismiss(); // cancel button click
	
	alt.accept(); // OK button click
	
	String text1=alt.getText();
	System.out.println(text1);
	
	alt.accept();
	
	
	}

}
