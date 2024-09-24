package com.TestSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	
	public static String getExcelTestData(String Sheetname ,int row,int cell) throws Exception {
		
		String path=System.getProperty("user.dir")+"\\Notes\\Testdata.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
    public static void getExcelTestData(String Sheetname ,int row,int cell,WebElement element) throws Exception {
		
		String path=System.getProperty("user.dir")+"\\Notes\\Testdata.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		element.sendKeys(data);
	}
	
	
	
	
	
}
