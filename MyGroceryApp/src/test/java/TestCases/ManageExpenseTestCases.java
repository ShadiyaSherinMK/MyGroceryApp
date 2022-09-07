package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.ManageExpense;

public class ManageExpenseTestCases extends BaseClass {
	LoginPage lp;
	ManageExpense me;

	@Test
	public void verifyTheBackGroundColorofResetButton() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.clickManageExpense();
		me.clickExpenseCategory();
		String actual = me.verifyBackGroundColorofResetButton();
		String expected = "rgb(255 193 7)";
		Assert.assertEquals(actual, expected, "::Background color is not as expected");
	}

	@Test
	public void verifyTheSelectUser() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		String actual = me.selectUser("Admin(Admin)");
		String expected = "Admin(Admin)";
		Assert.assertEquals(actual, expected, "::selected value is not as expected");

	}

	@Test
	public void verifyTheDateEntered() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		String actual = me.enterDate("6/9/2022");
		String expected = "6/9/2022";
		Assert.assertEquals(actual, expected, "::Date is not as expected");

	}

	@Test
	public void verifyTheSelectedCategory() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		String actual = me.selectCategory("vegetables");
		String expected = "vegetables";
		Assert.assertEquals(actual, expected, "::Selected category is not as expected");

	}

	@Test
	public void verifyselectOrderId() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		String actual = me.selectOrderId("4");
		String expected = "4";
		Assert.assertEquals(actual, expected, "::Selected order id is not as expected");

	}

	@Test
	public void verifyPurchaseId() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		String actual = me.selectPurchaseId("4");
		String expected = "4";
		Assert.assertEquals(actual, expected, "::selected purchase id is not as expected");
	}

	@Test
	public void verifySelectedExpenseType() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		String actual = me.selectExpenseType("4");
		String expected = "4";
		Assert.assertEquals(actual, expected, "::selected expense id is not as expected");
	}

	@Test
	public void verifyEnteredAmount() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		String actual = me.enterAmount("6000");
		String expected = "6000";
		Assert.assertEquals(actual, expected, "::entered amount is not as expected");
	}

	@Test
	public void verifyClickOfSaveButton() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		me = new ManageExpense(driver);
		me.ClickMoreInfoOfManageexpense();
		me.clickNewButton();
		boolean actual = me.clickSaveButton();
		boolean expected = true;
		Assert.assertEquals(actual, expected, "::SaveButton is not clicked");

	}
}
