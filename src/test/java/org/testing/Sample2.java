package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\User\\eclipse-workspace\\Frameworks\\excel\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(fin);

		Sheet sh = b.getSheet("Sheet1");

		// fetch all the rows
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {

			Row r = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if (type == 1) {
					String s = c.getStringCellValue();
					System.out.println(s);
				} else {
					if (DateUtil.isCellDateFormatted(c)) {
						Date D = c.getDateCellValue();
						System.out.println(D);
					} else {
						double d = c.getNumericCellValue();
						System.out.println(d);

					}
				}
			}

		}

	}

}
