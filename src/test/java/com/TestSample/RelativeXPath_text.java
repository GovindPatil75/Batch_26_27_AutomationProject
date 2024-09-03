package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXPath_text {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//WebElement -- Relative XPath -Xpath By text()
		//tagname[text()='text value']
		//WebElement element =driver.findElement(By.xpath("//tagname[text()='text value']"));

	  WebElement FP=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	  FP.click();
	 
	}

}
