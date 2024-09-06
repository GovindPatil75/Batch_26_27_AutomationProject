package com.TestSample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshotTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		
		 // Capture the Screenshot of Element
		WebElement LoginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		File src=LoginBtn.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_26_27_AutomationProject\\Screenshot\\loginbutton.png");
		FileUtils.copyFile(src, destn);
		
		
	}

}
