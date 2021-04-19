package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class Sample {
	public static void main(String[] args) throws IOException {
		// created a File
		 System.out.println("Selenium project");
		File f= new File("C:\\Users\\User\\eclipse-workspace\\Frameworks\\excel\\Book1.xlsx");
		// Fetching the Small object of the file
		FileInputStream fin= new FileInputStream(f);
		
		//create a workbook
	Workbook b	= new XSSFWorkbook(fin);
	
	//fetch a sheet
Sheet sh= b.getSheet("Sheet1");
// to fetch a row
 Row r= sh.getRow(2);
 System.out.println(r);
 
 // To fetch a Cell(Column)
 
 Cell c= r.getCell(2);
 
 System.out.println(c);
 
 

	}

}
