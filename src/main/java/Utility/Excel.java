package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getdata1(int row, int cell, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\automation class\\zerodhaAuto\\src\\test\\resources\\123.xlsx");
		String value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;	
	}
}
