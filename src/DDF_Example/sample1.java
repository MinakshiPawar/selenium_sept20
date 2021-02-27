package DDF_Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
