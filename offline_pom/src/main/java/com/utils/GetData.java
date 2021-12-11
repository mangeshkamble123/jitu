package com.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

	static FileInputStream fis = null;
	static Workbook wb = null;
	static Sheet sh = null;
	static Row r = null;
	static FileOutputStream fos = null;

	public static String getDataFromCell(int row, int col, String sheetname) {

		DataFormatter df = new DataFormatter();

		try {
			fis = new FileInputStream("test.xlsx");
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sh = wb.getSheet(sheetname);
		Cell c = sh.getRow(row).getCell(col);

		return df.formatCellValue(c);

	}

	public static void writeDatainCell(String filepath, String sheetname, int row, int col, String value) {

		try {
			fis = new FileInputStream(filepath);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (wb.getSheet(sheetname) != null)
			sh = wb.getSheet(sheetname);
		else
			wb.createSheet(sheetname);
		if (sh.getRow(row) != null)
			r = sh.getRow(row);
		else
			r = sh.createRow(row);
		if (r.getCell(col) != null)
			r.getCell(col).setCellValue(value);
		else
			r.createCell(col).setCellValue(value);

		try {
			fos = new FileOutputStream(filepath);
			wb.write(fos);
			fos.close();
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


