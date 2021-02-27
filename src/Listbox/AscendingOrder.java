package Listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AscendingOrder {

	private static final WebDriver AllOptions = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
 
 Thread.sleep(3000);
 
 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
 
Select s=new Select(month);
List<WebElement> allOptions = s.getOptions();
TreeSet tr=new TreeSet();                         //create object of treeset
System.out.println("-----before sorting---------");

for (WebElement ele : allOptions) {            //create object ele of selenium
	String text=ele.getText();
	System.out.println(text);
	tr.add(text);                              //add text in treeset
}


System.out.println("--------After sorting------");


for(Object ele1:tr) {                      //create object ele1 of java
	System.out.println(ele1);
}
//System.out.println(tr);                      //Showing elements in index form



	}
}