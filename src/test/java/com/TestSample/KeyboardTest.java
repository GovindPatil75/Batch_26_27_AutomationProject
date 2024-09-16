package com.TestSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        
        //Element identify
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        
        //Create the object of Actions class 
        Actions act=new Actions(driver);
        
        //case 1 :Send value to ELement in Upper case using Actions class
        act.keyDown(email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
        
        //case 2 : ctrl+a--ctrl +c --ctrl+v
        
        //Ctrl+A
        
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        
        //Ctrl +C
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        driver.findElement(By.xpath("//input[@id='pass']")).click();
        
        //Ctrl+V
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
	}

}
