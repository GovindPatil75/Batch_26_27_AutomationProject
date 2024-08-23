package com.TestSample;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestScript {

	public static void main(String[] args) {
		
		// Browser execution -- executable setup
		WebDriverManager.chromedriver().setup();
		
		//Create the Object of BrowserDriver class
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		// to maximize browser window 
		driver.manage().window().maximize();
		
		
		//Options opt=driver.manage();
		//Window window=opt.window();
		//window.maximize();
		
		//Edge Browser 
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		
		
		
		

	}

}
