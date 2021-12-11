package com.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.testbase.TestBase;

public class ExcelUtility extends TestBase {

	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet sh=null;
	private static Row r;
	private static FileOutputStream fos;
	
	public static String getCellDataFromExcel(String filepath, String name, int rowno, int colno){
	DataFormatter df = new DataFormatter ();
		try {
		fis = new FileInputStream(filepath);
		wb= WorkbookFactory.create(fis);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		sh = wb.getSheet(name);
		Cell c = sh.getRow(rowno).getCell(colno);
		return df.formatCellValue(c);
	
	}
	
	public static String getDataFromCell(String FilePath, String SheetName, int row, int cols) {
		DataFormatter df = new DataFormatter();
		try {
			fis = new FileInputStream(FilePath);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sh = wb.getSheet(SheetName);
		Cell c = sh.getRow(row).getCell(cols);
		return df.formatCellValue(c);
	}
	
	
	public static void writeDataInCell(String FilePath, String SheetName, int row, int col, String value) {
		try {
			fis = new FileInputStream(FilePath);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (wb.getSheet(SheetName)!=null)
		sh = wb.getSheet(SheetName);
		else
		sh=wb.createSheet(SheetName);
		
		
		if (sh.getRow(row)!=null)
			r= sh.getRow(row);
		else
			r = sh.createRow(row);
		
		if ( r.getCell(col)!=null)
			r.getCell(col).setCellValue(value);
		else
			r.createCell(col).setCellValue(value);		
		
		try {
			fos= new FileOutputStream(FilePath);
			wb.write(fos);
			wb.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
