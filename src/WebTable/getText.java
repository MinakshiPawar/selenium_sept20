package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Selenium/HTML/Sample2.html");
	String text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[2]/td[3]")).getText();
	System.out.println(text);
}
}
