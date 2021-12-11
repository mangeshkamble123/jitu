package com.utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadCell {

	public static String readCell(int row, int col)throws Exception{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("Test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Cell c= sh.getRow(row).getCell(col);
		return df.formatCellValue(c);
	}
}
