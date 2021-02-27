package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getCellCount {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
		
		
		int lastCellNum=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
		
		System.out.println(lastCellNum);
	}
	
}
