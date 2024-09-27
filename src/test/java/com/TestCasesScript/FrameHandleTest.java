package com.TestCasesScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
	//Mainpage --Frame 1
	WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test");

	//frame1---Mainpage
	driver.switchTo().defaultContent();
	
	//Mainpage-- frame2
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test");
	
	//frame2---Mainpage
	driver.switchTo().defaultContent();
	
	
	//Mainpage-- outterframe3--inneriframe
	
	driver.switchTo().frame(2); // index 
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test");
	
	WebElement Inneriframe=driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(Inneriframe);
	driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
	
	//inneriframe--Outterframe--Mainpage
	driver.switchTo().parentFrame(); // inneriframe--Outterframe
	driver.switchTo().defaultContent(); // Outterframe--Mainpage
	
	
	//mainpage--frame4
	
	driver.switchTo().frame(3);
	driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Test");
	
	
	
	
	
	
	
	
	
	
	//
	}

}
