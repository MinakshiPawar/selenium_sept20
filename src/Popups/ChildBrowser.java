package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	
	//click on new window  button
	
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
	//get id/address of main page
	String idOfMainPage = driver.getWindowHandle();
	
	//get id/address of child browser pop up
	Set<String> ids = driver.getWindowHandles();
	
	ArrayList al= new ArrayList(ids);
	System.out.println(al.get(0));   //To get address of main page
	
	System.out.println(al.get(1));   //To get address of child browser
	Object sid = al.get(1);
driver.switchTo().window((String)sid);
driver.manage().window().maximize();
	
	
}
} 