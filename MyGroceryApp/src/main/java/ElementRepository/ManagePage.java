package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class ManagePage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ManagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page'][1]")
	WebElement ManagePage;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;
	@FindBy(name = "title")
	WebElement title;
	@FindBy(id = "page")
	WebElement page;
	@FindBy(name = "create")
	WebElement saveButton;

	public void clickManagePage() {
		ManagePage.click();
	}

	public void clickNewButton() {
		newButton.click();
	}

	public void enterTitle(String Title) {
		title.sendKeys(Title);
	}

	public void enterPageName(String PageName) {
		page.sendKeys(PageName);
	}

	public String getTextOfSaveButton() {
		return gu.getElementText(saveButton);

	}

	public void clickSaveButton() {
		saveButton.click();
		
	}
}
