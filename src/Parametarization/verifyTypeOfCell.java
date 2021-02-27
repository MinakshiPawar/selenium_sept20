package Parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifyTypeOfCell {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
	
		Cell cellValue=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1);
System.out.println(cellValue.getCellType());	   // To get cell type	

if(cellValue.getCellType()==CellType.STRING) {
	System.out.println(cellValue.getStringCellValue());      //string abc
}
else if(cellValue.getCellType()==CellType.NUMERIC) {
	System.out.println(cellValue.getNumericCellValue());     //numeric 2
}

else if(cellValue.getCellType()==CellType.BOOLEAN) {
	System.out.println(cellValue.getBooleanCellValue());   //o/p-Boolean True
}
}
}