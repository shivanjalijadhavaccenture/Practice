package Test_Acti;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Acti.Base;

import POM_Acti.HomePage;
import POM_Acti.LoginPage;
import Utility_Acti.UtilTest;

public class TestClass extends Base {
	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void openBrowser() {
		intializeBrowser();//both methods are non-static so we can call directly non static method in non static method
		 hp=new HomePage(driver);
		 lp=new LoginPage(driver);
		
	}
	@BeforeMethod
	public void openApp() throws Throwable {
		
		lp.enterUN(UtilTest.testData(1, 0));
		lp.enterPWD(UtilTest.testData(1, 1));
		lp.clickLoginBtn();
		Thread.sleep(3000);
		
	}
	
	/*   @Test
	   public void verifyTitle() throws Throwable {
		  
	 	   String exp=UtilTest.testData(1, 3);
	 	   //Reporter.log(exp);
	 	   boolean act = driver.getPageSource().contains(exp);
	 	  //boolean act = driver.getPageSource().contains("actiTIME -  Enter Time-Track");
	 	   Assert.assertTrue(act);
	    }*/
   @Test
	public void textVerify() throws Throwable {
	  // hp=new HomePage(driver);
		//String exp ="Enter Time-Track";//UtilTest.testData(1, 2);
	   String exp=UtilTest.testData(1, 2);
		String act=hp.verifyText();
		Thread.sleep(5000);
		Assert.assertEquals(exp, act,"both are different TC fail");
	}

   @AfterMethod
   public void closeApp() {
	   Reporter.log("Closing app",true);
   }
   @AfterClass
   public void closeBrowser() {
	   Reporter.log("closing browser",true);
   }

}
