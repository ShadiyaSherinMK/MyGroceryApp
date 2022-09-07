package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class DashBoardPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='data-toggle']")
	WebElement LoggedInUserName;

	public String verifyTheNameOfLoggedInUserName() {
		return gu.getElementText(LoggedInUserName);
	}
}