package ElementRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class CategoryPage {
	WebDriver driver;
	GeneralUtilities gu;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	WebElement Category;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/category/edit?edit=2&page_ad=1']")
	WebElement editDairyandBakery;
	@FindBy(id = "1-selectable")
	WebElement dropdown;
	@FindBy(id = "main_img")
	WebElement chooseFile;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[6]//td[2]")
	public WebElement image;

	public void clickMoreInfoOfCategory() {
		Category.click();
	}

	public void clickEditOfDairyAndBakery() {
		editDairyandBakery.click();
	}

	public String getSelectedValueFromDropDown(String dropDownValue) {
		return gu.selectFromDropDown(dropdown, dropDownValue);
	}

	public void clickChooseFile() {
		chooseFile.click();
	}

	public void uploadFile() throws AWTException {
		gu.fileUpload(System.getProperty("user.dir") + ("\\src\\main\\resources\\uploadFiles\\xxx.docx"));

	}

	public boolean verifyUploadFile() {
		return gu.isValueDisplayed(image);
	}

}
