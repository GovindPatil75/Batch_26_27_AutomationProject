package com.TestSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//Identify the drop down Element
    WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));

        //create the Object of Select class
    Select dropdownhadler=new Select(Country);
    
        //SelectByIndex
    //dropdownhadler.selectByIndex(10);
       
       //SelectByValue
    //dropdownhadler.selectByValue("BAHAMAS");
    
      //SelectByVisibletext
    dropdownhadler.selectByVisibleText("INDIA");
    
   // Library.handleDropDown(Country, "INDIA");
    
    //how to get count of dropdown option
    
    List<WebElement> allOptions=dropdownhadler.getOptions();
    int DropDownCount=allOptions.size();
    System.out.println(DropDownCount); // 264
    
    for(int i=0;i<DropDownCount;i++) {
    	
    	String text=allOptions.get(i).getText();
    	System.out.println(text);
    	
    	if(text.equals("BERMUDA")) {
    		allOptions.get(i).click();
    		break;
    	}
    }
    
	}

}
