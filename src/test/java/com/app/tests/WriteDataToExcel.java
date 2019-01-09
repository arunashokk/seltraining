package com.app.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataToExcel {

	@Test
	
	public void writeData() throws Exception {
		File file = new File ("/Users/arunkumarselvam/Documents/workspace/mySeleniumProj/src/test/resources/TestData.xlsx"); // to specify file location
		FileInputStream in = new FileInputStream(file); // to read the file using FileInputStream class 
		Workbook wb = new XSSFWorkbook(in); //to read file using XSSFWorkbook class
		Sheet sh = wb.getSheet("Sheet1"); //to get the sheet
		int row = 5;//specify in which row u want to write 
		int col = 2;//specify in which cell u want to write 
		
		Row rows = sh.getRow(row); //get that row 
		if(rows == null){
			sh.createRow(row);
		}
		
		Cell currentCell = sh.getRow(row).getCell(col); //get that cell where u want to write
		if(currentCell == null){
			sh.getRow(row).createCell(col).setCellValue("Test Message 6");
		}
		else {
			sh.getRow(row).getCell(col).setCellValue("Test Message 9");
		}
		
		//write the value into excel. Until here the written value will be in XSSFWorkbook and we need to transfer that to actual file
		
		FileOutputStream out = new FileOutputStream("/Users/arunkumarselvam/Documents/workspace/mySeleniumProj/src/test/resources/TestData.xlsx");
		wb.write(out);
		out.close();
		
		
		
	}

}
