package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyElementPresentln_StaticTable {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Selenium/HTML/Sample2.html");
		
		String exptext = "Selenium";
		String actText = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[2]/td[2]")).getText();
		
		if (exptext.equals(actText)) {
			System.out.println("Given expected text "+ exptext + " found");
			
		} else {
			System.out.println("Given expected text "+ exptext + " Not found");
		}
		
	}

}
