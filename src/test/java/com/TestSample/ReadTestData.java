package com.TestSample;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static void main(String[] args) throws Exception {
		
		//Location excel -- string refvar
		String refvar="C:\\Users\\Dell\\eclipse-workspace\\Batch_26_27_AutomationProject\\Notes\\Testdata.xlsx";
        
		//Create the Object of FileInputStream class
		FileInputStream fis=new FileInputStream(refvar);
		
		//Create the Object of XSSFWorkbook class
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//get data from sheet with row and cell value // 0,0
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		//get data from sheet with row and cell value // 0,1
		String data1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
				
		System.out.println(data1);
		
		//get data from sheet with row and cell value // 0,2
		String data2=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
						
	    System.out.println(data2);
	    
	    //0,3
	    double t=wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();
	    System.out.println(t);
	    
	    //Convert Numeric data to string 
	    String t1=String.valueOf(t);
	    System.out.println(t1);
	}

}
