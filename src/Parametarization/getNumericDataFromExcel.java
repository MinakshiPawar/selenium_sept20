package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
		
		double value= WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();
	
	System.out.println(value);
	}
	
}
