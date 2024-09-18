package com.TestSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserWindowTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		// 
		
		String ParentwindowID=driver.getWindowHandle();
		System.out.println(ParentwindowID);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> ALLID=driver.getWindowHandles();
		System.out.println(ALLID);
		
		//Case 2: 
//		Iterator<String> IT=ALLID.iterator();
//		
//		while(IT.hasNext()) {
//			
//			String ChildWindowID=IT.next();
//			
//			if(!ParentwindowID.equals(ChildWindowID)) {
//				
//				driver.switchTo().window(ChildWindowID);
//				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
//				
//			}
//		}
//		
		//Case 1 :
		
		List<String> list=new ArrayList<String>(ALLID);
		
		list.get(0); // parent id
		String ChildwindowID=list.get(1); // child window id
		
		System.out.println(ChildwindowID);
		
		driver.switchTo().window(ChildwindowID);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
		
		driver.switchTo().window(ParentwindowID);
		
		//driver.close(); // current browser window close
		
		driver.quit(); // current +all open window close 
	}

}
