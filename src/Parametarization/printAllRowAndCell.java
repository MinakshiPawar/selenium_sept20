package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printAllRowAndCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
	org.apache.poi.ss.usermodel.Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");
	
	int lastRowIndex=sh.getLastRowNum();
	for (int i = 0; i <=lastRowIndex; i++) {
		int lastCellIndex=sh.getRow(i).getLastCellNum()-1;
		
		
		for (int j = 0; j <=lastCellIndex; j++) {
			Cell cellValue=sh.getRow(i).getCell(j);
			
     	   if(cellValue.getCellType()==CellType.STRING)
     	   {
     		   System.out.print(cellValue.getStringCellValue()+" ");
     	   }
     	   
     	   else if(cellValue.getCellType()==CellType.NUMERIC)
     	   {
     		   System.out.print(cellValue.getNumericCellValue()+" ");
     	   }

     	   else if(cellValue.getCellType()==CellType.BOOLEAN)
     	   {
     		   System.out.print(cellValue.getBooleanCellValue()+" ");
     	   } 

		}

	System.out.println();
	}
	
}
}
