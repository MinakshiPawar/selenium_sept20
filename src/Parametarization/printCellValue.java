package Parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printCellValue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");

           org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
           int lastRowIndex=sh.getLastRowNum();
           System.out.println(lastRowIndex);

	for (int i = 0; i <=lastRowIndex; i++) {
		Cell cellValue=sh.getRow(i).getCell(0);
		System.out.println(cellValue);
		
//		if(cellValue.getCellType()==CellType.STRING)
//   	   {
//     		   System.out.print(cellValue.getStringCellValue());
//     	   }
//     	   
//		else if(cellValue.getCellType()==CellType.NUMERIC) {
//			System.out.println(cellValue.getNumericCellValue());
//		}
//		
//		else if(cellValue.getCellType()==CellType.BOOLEAN) {
//			System.out.println(cellValue.getBooleanCellValue());
//		}
		
	}
	
	}
}