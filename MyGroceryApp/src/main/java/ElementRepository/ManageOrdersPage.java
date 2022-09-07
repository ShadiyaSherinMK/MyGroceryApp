package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class ManageOrdersPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ManageOrdersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']")
	WebElement manageOrders;

	@FindBy(id = "sidebar-overlay")
	WebElement searchManageOrderTab;

	@FindBy(name = "st")
	WebElement statusSelectorMnageOrderTab;

	public void clickManageOrder() {
		manageOrders.click();
	}

	public void clickSerachMangeOrderTab() {
		searchManageOrderTab.click();
	}

	public String getSelectedValueFromDropDown(String dropDownValue) {
		return gu.selectFromDropDown(statusSelectorMnageOrderTab, dropDownValue);
	}

	public String verifytheFontSizeOfManageOrder() {
		return gu.getStyleProperties(manageOrders, " fontsize");
	}
}
