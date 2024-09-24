package com.TestSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestdemoExcel {

	public static void main(String[] args) throws Exception {
		
		   WebDriverManager.chromedriver().setup();
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://demo.guru99.com/test/newtours/register.php");
		   driver.manage().window().maximize();

		  String path=System.getProperty("user.dir")+"\\Notes\\Testdata.xlsx";
		  FileInputStream fis=new FileInputStream(path);
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		  //Firstname
		  //String FN=wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		  WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		  //FirstName.sendKeys(FN);
		  
		  Library.getExcelTestData("Sheet2", 0, 0, FirstName);
		  
		  //Lastname
		  
	}

}
