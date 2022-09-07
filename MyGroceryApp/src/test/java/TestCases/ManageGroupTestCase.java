package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.ManageGroups;

public class ManageGroupTestCase extends BaseClass {
	LoginPage lp;
	ManageGroups mg;

	@Test
	public void verifyTheClickofManageGroup() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mg = new ManageGroups(driver);
	     mg.clickManageGroup();

	}

	@Test
	public void verifyTheDeleteButtonIsClicked() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mg = new ManageGroups(driver);
		 mg.clickDeletebutton();
	}

	public void verifyTheAlertMessageIsPresentWhenClickTheDeleteButton() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		mg = new ManageGroups(driver);
		mg.clickManageGroup();
		mg.clickDeletebutton();
		String actual = mg.verifyTheAlertMessageIsPresent();
		String expected = "Do you want to delete this group?";
		Assert.assertEquals(actual, expected, "::AlertMessage is not as expected");

	}
}