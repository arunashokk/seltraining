package com.app.tests;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcelData {

	@Test
	public void readData() throws Exception{
	File file = new File("/Users/arunkumarselvam/Documents/workspace/mySeleniumProj/src/test/resources/TestData.xlsx"); //to specify the file location
	FileInputStream in = new FileInputStream(file); //to read the excel
	Workbook wb = new XSSFWorkbook(in); //to read the excel; Workbook is an interface; wb is a reference; XSSFWorkbook is a class; "in" here is a value passed to constructor in XSSFWorkbook class
	Sheet sh = wb.getSheet("Sheet1"); //to get the sheet
	
	//to get each row and cell value from excel
	for (int i = 0; i<sh.getPhysicalNumberOfRows(); i++){
		Row eachRow = sh.getRow(i);
		
		for (int j = 0; j<eachRow.getPhysicalNumberOfCells(); j++){
			Cell cell = eachRow.getCell(j);
			
			if(cell.getCellType() == 0){
				System.out.println(cell.getNumericCellValue());
			}
			else if (cell.getCellType() == 1){
				System.out.println(cell.getStringCellValue());
			}
		}
		
	}
	}
}

	