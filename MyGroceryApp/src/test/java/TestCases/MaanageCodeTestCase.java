package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.ManageCode;

public class MaanageCodeTestCase extends BaseClass {
	LoginPage lp;
	ManageCode mc;

	@Test
	public void isSelectedRadioButton() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mc = new ManageCode(driver);
		mc.clickManageCode();
		boolean actual = mc.isSelectedRadioButton();
		boolean expected=true;
		Assert.assertEquals(actual,expected, "::Radio button is not selected");
	}
}
