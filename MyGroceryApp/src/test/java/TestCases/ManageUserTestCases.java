package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.ManageUsers;

public class ManageUserTestCases extends BaseClass {

	LoginPage lp;
	ManageUsers mu;
	@Test
	public void verifyTheclickOFManageUserTab() throws Exception {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mu = new ManageUsers(driver);
		mu.clickManageUserTab();
		String actual=mu.verifytitle();
		String expected="List Users";
		Assert.assertEquals(actual, expected,"::title is not as expected");
		
	}
	
		

	@Test
	public void verifyThePassWordIsDisplayed() throws Exception {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mu = new ManageUsers(driver);
		mu.clickManageUserTab();
		mu.clickShowTab();
		boolean actual = mu.verifyDetails();
		boolean expected = true;
		Assert.assertEquals(actual, expected, "::Details are not displayed");

	}
}
