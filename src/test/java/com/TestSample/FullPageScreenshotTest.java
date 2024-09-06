package com.TestSample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class FullPageScreenshotTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Full page Screenshot
		
		String RM=RandomString.make(5);
		String path=System.getProperty("user.dir");
		System.out.println(path);
		
		TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\Screenshot\\"+RM+".png");
		FileUtils.copyFile(src, destn);
		
		
		
		
	}

}
