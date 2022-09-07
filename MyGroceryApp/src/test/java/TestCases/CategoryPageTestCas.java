package TestCases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.CategoryPage;
import ElementRepository.LoginPage;
import Utilities.GeneralUtilities;

public class CategoryPageTestCas extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	CategoryPage cp;

	@Test
	public void verifySelectedValueFromDropDown() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		cp = new CategoryPage(driver);
		cp.clickMoreInfoOfCategory();
		cp.clickEditOfDairyAndBakery();
		String actual = cp.getSelectedValueFromDropDown("Munnar Special");
		String expected = "Munnar Special";
		Assert.assertEquals(actual, expected, "::selected value is as not expected");
	}

	@Test
	public void FileUpload() throws AWTException {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		cp = new CategoryPage(driver);
		cp.clickMoreInfoOfCategory();
		cp.clickEditOfDairyAndBakery();
		cp.clickChooseFile();
		cp.uploadFile();//assertion
		
	}
	@Test
	public void verifyFileUpload() throws AWTException {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		cp = new CategoryPage(driver);
		cp.clickMoreInfoOfCategory();
		cp.clickEditOfDairyAndBakery();
		cp.clickChooseFile();
		cp.uploadFile();
	boolean actual=cp.image.isDisplayed();
		boolean expected= true;
		Assert.assertEquals(actual, expected,"::uploaded file is not  expected");
	}
}
