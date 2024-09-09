package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestActions_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//Right click Actions  --create the Object of Actions class
		
		Actions act=new Actions(driver);
		
		//Element 
		
		//WebElement RCE=driver.findElement(By.xpath("//span[text()='right click me']"));
		//WebElement delete=driver.findElement(By.xpath("//span[text()='Delete']"));
		//act.contextClick(RCE).click(delete).build().perform();
		
		//Double click 
		
		WebElement DCE=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		act.doubleClick(DCE).build().perform();
	}

}
