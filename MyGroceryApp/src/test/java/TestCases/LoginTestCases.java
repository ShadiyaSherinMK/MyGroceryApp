package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Constant.Constant;
import ElementRepository.LoginPage;

public class LoginTestCases extends BaseClass {
	LoginPage lp;

	@Test
	public void verifyTextOfLoginButton() {
		lp = new LoginPage(driver);
		String Expected = lp.getTextOfLoginButton();
		String actual = "Sign In";
		Assert.assertEquals(actual, Expected, "::Text is not as expected");
		lp.performLogin("admin", "admin");

	}
}