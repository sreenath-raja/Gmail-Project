package com.datadriven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven {
	static Object[][] arr;
	static String values;
	
	public static Object[][] datas(String fileName, int Index) throws IOException{
		File f = new File("C:\\Cucumber\\GmailProject\\Excel\\"+fileName);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(Index);
		
		int Rowsize = sheetAt.getPhysicalNumberOfRows();
		//int[] a = new int[5];
		//Object[][] arr = new Object[][];
		
		arr = new Object[Rowsize][sheetAt.getRow(0).getPhysicalNumberOfCells()];
		for (int i = 1; i < Rowsize; i++) {
			Row row = sheetAt.getRow(i);
		   int cellsize = row.getPhysicalNumberOfCells();
		   for (int j = 0; j < cellsize; j++) {
			   Cell cell = row.getCell(j);
			   CellType cellType = cell.getCellType();
			   if (cellType.equals(cellType.STRING)) {
				   values = cell.getStringCellValue();
				   arr[i-1][j] = values;
				   System.out.println(values);	
			} else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				long value = (long)numericCellValue;
				values = String.valueOf(value);
				arr[i][j] = values;
				System.out.println(values);
				
			}
			
		}
			
		}
		
		return arr;
	}

}
