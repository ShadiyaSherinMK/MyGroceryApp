package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class ManageGroups {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();

	public ManageGroups(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-group']")
	WebElement ManageGroup;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Group/delete?del=118&page_ad=1']")
	WebElement deleteButton;

	public void clickManageGroup() {
		ManageGroup.click();
	
	}

	public void clickDeletebutton() {
		deleteButton.click();
		
	}

	public String verifyTheAlertMessageIsPresent() {
		return gu.getAlertText(driver);

	}

}
