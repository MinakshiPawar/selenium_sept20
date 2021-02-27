package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowCount {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
		
		int lastRowNum= WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(lastRowNum);
		System.out.println("Total number of rows in sheet1:"+(lastRowNum+1));
		
		
        int lastCellNum=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
		
		System.out.println(lastCellNum);
		//System.out.println("Total number of cells in Row 1:"+(lastCellNum+1));
	}
	
}
