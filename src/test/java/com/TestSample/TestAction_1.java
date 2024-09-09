package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAction_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Create the Object of Actions class
		Actions act=new Actions(driver);
		
		//Move To Element + click 
		WebElement FP=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		act.moveToElement(FP).click().build().perform();
	}

}
