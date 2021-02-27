package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getStringDataFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
	
	System.out.println(value);
	
	}

}
