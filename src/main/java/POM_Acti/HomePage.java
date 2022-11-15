package POM_Acti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	//declaration
		@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement kk;
		
		//initialization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//Implementation
		public String verifyText() {
			String act=kk.getText();
			return act;
		}
		
		
}
