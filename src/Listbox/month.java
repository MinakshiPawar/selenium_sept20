package Listbox;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class month {

	private static final WebDriver AllOptions = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
 
 Thread.sleep(3000);
 
 //step 1
 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
 //step 2
 Select s=new Select(month);
 
 //step 3
 
 s.selectByVisibleText("Jan");    //to select month from drop down
 //s.selectByValue("6");            //to get month from with id from drop down
 //s.selectByIndex(7);              //to get month by index id
	
 
 System.out.println("--------to get size of list---------- ");
	List<WebElement> allOptions = s.getOptions();   //to select all options
	
	System.out.println(allOptions.size());          //to get size of all options
	
	System.out.println("-------to get text of list elements----------");
//	for (WebElement ele : allOptions)             //to create ele object
//	{
//		System.out.println(ele.getText());         //to print list
//	}
	

	java.util.Iterator<WebElement> itr = allOptions.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next().getText());
		
	}
		
	
	
	
	
	}
}
