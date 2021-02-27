package Listbox;

import java.awt.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
 driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
 
 Thread.sleep(3000);
 
  WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

	Select s=new Select(day);
	
	java.util.List<WebElement> Alloptions = s.getOptions();
	
	System.out.println(Alloptions.size());
	
//	
//	for (int i = 0; i <= Alloptions.size()-1; i++) {
//		System.out.println(Alloptions.get(i).getText());
//	}
	
	
 Iterator<WebElement> itr = Alloptions.iterator();
 while (itr.hasNext()) {
	System.out.println(itr.next().getText());
	
}
	}
}
