package com.TestSample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Library {
	
	public static void handleDropDown(WebElement element,String text) {
		
		Select handler=new Select(element);
		handler.selectByVisibleText(text);
	}

	public static void scrollByElement(ChromeDriver driver ,WebElement element) {
		
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
}
