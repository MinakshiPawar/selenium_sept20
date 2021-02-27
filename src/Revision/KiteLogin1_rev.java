package Revision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KiteLogin1_rev {

	//Declaration of web elements
		@FindBy(xpath="//input[@id='userid']")
		private WebElement UN;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement PWD;
		
		@FindBy(xpath="//button[@class='button-orange wide']")
	    private WebElement login;
	
	
}
