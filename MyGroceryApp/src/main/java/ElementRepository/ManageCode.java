package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class ManageCode {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ManageCode(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/add-cod']")
	WebElement manageCode;
	@FindBy(name = "cod")
	WebElement radioButton;

	public void clickManageCode() {
		manageCode.click();
	}

	public boolean isSelectedRadioButton() {
		return gu.isSelectFromRadio(radioButton);
	}

}
