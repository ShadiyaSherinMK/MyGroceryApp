package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.MobileSlider;

public class MobileSliderTestCase extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	MobileSlider ms;

	@Test
	public void verifyMobileSliderIsClicked() throws Exception {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		ms = new MobileSlider();
		ms.clickmobileSlider();
		String actual = ms.getTitleOfPage();
		String expected = "List Slider";
		Assert.assertEquals(actual, expected, "::Title of the page is not as expected");
	}

	public void verifyTheNewButtonIsClicked() throws Exception {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		ms = new MobileSlider();
		ms.clickmobileSlider();
		ms.clickNewButton();
		String actual = ms.getTitleOfAddSliderPage();
		String expected = "Add Slider";
		Assert.assertEquals(actual, expected, "::titleofPage is not as expected");
	}

	public void enteredLink() throws Exception {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		ms = new MobileSlider();
		ms.clickmobileSlider();
		ms.clickNewButton();
		String actual = ms.enterlink("https::end.com");
		String expected = "https::end.com";
		Assert.assertEquals(actual, expected, "::entered link is not as expected");
	}

	public void verifySaveButton() throws Exception {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "admin");
		ms = new MobileSlider();
		ms.clickmobileSlider();
		ms.clickNewButton();
		ms.enterlink("https::end.com");
		ms.clickSaveButton();
		String actual = ms.verifyAlertMessage();
		String expected = "Slider Created Successfully";
		Assert.assertEquals(actual, expected, "::Alertmessage is not as expected");
	}

}
