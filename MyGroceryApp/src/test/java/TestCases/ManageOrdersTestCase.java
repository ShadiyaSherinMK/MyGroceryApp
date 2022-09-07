package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.ManageOrdersPage;

public class ManageOrdersTestCase extends BaseClass {
	LoginPage lp;
	ManageOrdersPage mop;
  @Test
  public void verifySelectedValueFromStatusDropdown() {
	  lp=new LoginPage(driver);
	  lp.performLogin("admin","admin");
	  mop=new ManageOrdersPage(driver);
	  mop.clickManageOrder();
	  mop.clickSerachMangeOrderTab();
	  String actual=mop.getSelectedValueFromDropDown("Paid");
	  String expected="Paid";
	  Assert.assertEquals(actual, expected, "::Selected value is not as expected");
  }
  @Test
  public void verifytheFontSizeOfManageOrder() {
	  lp=new LoginPage(driver);
	  lp.performLogin("admin","admin");
	  mop=new ManageOrdersPage(driver);
	  mop.clickManageOrder();
	  String actual1=mop.verifytheFontSizeOfManageOrder();
	  String expected1="1rem";
	  Assert.assertEquals(actual1, expected1, "::font size value is not as expected");

  }
}
