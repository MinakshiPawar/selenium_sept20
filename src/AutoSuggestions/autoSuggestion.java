package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");  //entered find elements
		Thread.sleep(2000);
		
		String exp= "oneplus 7 pro";   // exp text
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));//ul is to select whole list and li is child
		
	for (WebElement ele : allOptions) // store all list options in ele
	{
	String act=ele.getText();    // to get text of actual elements
	
	if(act.equals(exp))          // if actual match with expected
	{
		ele.click();
		break;
	}
	}
		
}
}