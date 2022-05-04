package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_Batch_January\\TestData\\Data.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		 wb=new XSSFWorkbook(fis);
	}
	
	public String getStringData(String sheetname,int row,int cell) {
		
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
