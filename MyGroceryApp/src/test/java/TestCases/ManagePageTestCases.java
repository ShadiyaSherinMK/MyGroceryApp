package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.ManagePage;

public class ManagePageTestCases extends BaseClass {
	LoginPage lp;
	ManagePage mp;

	@Test
	public void verifyTheAdditionOfNewPage() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mp = new ManagePage(driver);
		mp.clickManagePage();
		mp.clickNewButton();
		mp.enterTitle("NewPage");
		mp.enterTitle("NEWPAGE");
		mp.clickSaveButton();
		
	}

	@Test
	public void verifyTheTextOfSaveButton() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mp = new ManagePage(driver);
		mp.clickManagePage();
		mp.clickNewButton();
		String actual = mp.getTextOfSaveButton();
		String expected = "Save";
		Assert.assertEquals(actual, expected, "::text is not as expected");
		mp.clickSaveButton();//add assertion
	}
}
