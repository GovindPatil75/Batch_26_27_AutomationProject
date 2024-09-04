package com.TestSample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Library {
	
	public static void handleDropDown(WebElement element,String text) {
		
		Select handler=new Select(element);
		handler.selectByVisibleText(text);
	}

}
