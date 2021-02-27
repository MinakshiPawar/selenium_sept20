package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyElementPresentIn_DynamicTable {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Selenium/HTML/Sample2.html");
		
		String exptext="SQL";
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
		//System.out.println("Row size is: "+rowSize);
		//boolean eleFound = false;
		for (int i = 2; i <=rowSize; i++) {
			
			
		int colSize= driver.findElements(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td")).size();
		//System.out.println("Col size is: " +colSize);
		for (int j = 1; j <=colSize; j++) {
			String actText= driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td["+j+"]")).getText();
		
		if (exptext.equals(actText)) {
			System.out.println("Given expected text "+exptext+ "Found at index:" +i+","+j);
			// eleFound=True;
			break;
		} 
		}
		
		//if(eleFound) {
			
		}
		}
			
			
		}
	
	

