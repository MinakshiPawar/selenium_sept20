package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_col_Count_for_row1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Selenium/HTML/Sample2.html");
		
	int colCountforRow = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th")).size();
		//int colCountforRow = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[2]/td")).size();
		
		System.out.println("Total no of column in the row:"+ colCountforRow);
	}

}
