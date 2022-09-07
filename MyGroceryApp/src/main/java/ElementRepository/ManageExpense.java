package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class ManageExpense {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public ManageExpense(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@data-widget='pushmenu']")
	WebElement manageExpense;
	@FindBy(xpath = "(//li[@class='nav-item has-treeview']//a[@class='nav-link'])[5]")
	WebElement expenseCategory;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	WebElement resetButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/expense']")
	WebElement moreinfoOfManageExpense;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement NewButton;
	@FindBy(xpath = "//select[@name='user_id']")
	WebElement user;
	@FindBy(id = "ex_date")
	WebElement Date;
	@FindBy(xpath = "//select[@id='ex_cat']")
	WebElement category;
	@FindBy(id = "order_id")
	WebElement OrderId;
	@FindBy(id = "purchase_id")
	WebElement purchaseId;
	@FindBy(id = "ex_type")
	WebElement expenseType;
	@FindBy(id = "amount")
	WebElement amount;
	@FindBy(xpath = "//button[@name='create']")
	WebElement saveButton;

	public void clickManageExpense() {
		manageExpense.click();

	}

	public void clickExpenseCategory() {
		expenseCategory.click();
	}

	public String verifyBackGroundColorofResetButton() {
		return gu.getStyleProperties(manageExpense, "background-color");
	}

	public void clickNewButton() {
		NewButton.click();
	}

	public void ClickMoreInfoOfManageexpense() {
		moreinfoOfManageExpense.click();
	}

	public String selectUser(String dropDownValue) {
		return gu.selectFromDropDown(NewButton, dropDownValue);
	}

	public String enterDate(String date) {
		Date.sendKeys(date);
		return date;

	}

	public String selectCategory(String dropDownVlaue) {
		return gu.selectFromDropDown(Date, dropDownVlaue);
	}

	public String selectOrderId(String dropDownValue) {
		return gu.selectFromDropDown(OrderId, dropDownValue);
	}

	public String selectPurchaseId(String dropDownValue) {
		return gu.selectFromDropDown(purchaseId, dropDownValue);
	}

	public String selectExpenseType(String dropDownValue) {
		return gu.selectFromDropDown(expenseType, dropDownValue);
	}

	public String enterAmount(String Amount) {
		amount.sendKeys(Amount);
		return Amount;
	}

	public boolean clickSaveButton() {
		 saveButton.click();
		return true;
	}

}
