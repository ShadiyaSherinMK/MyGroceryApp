package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.DashBoardPage;
import ElementRepository.LoginPage;

public class DashBoardPageTestCase extends BaseClass{
	WebDriver driver;
	LoginPage lp;
	DashBoardPage dbp;
  @Test
  public void verifyTheLoggedInUserName() {
	  lp=new LoginPage(driver);
	  lp.performLogin("admin", "admin");
	  dbp=new DashBoardPage(driver);
	  String actual=dbp.verifyTheNameOfLoggedInUserName();
	  String expected="Admin";
	  Assert.assertEquals(actual,expected,"::Name of Logged in user as not expected");
	  
  }
}
