package ElementRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ClickActionHelper;
import Utilities.GeneralUtilities;

public class MobileSlider {

	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	ClickActionHelper cah = new ClickActionHelper();

	public MobileSlider() {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='nav-item']//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-slider\"]")
	WebElement mobileSlider;
	@FindBy(xpath = "//h1[text()='List Sliders']")
	WebElement title;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement NewButton;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
	WebElement AddSliderTitle;
	@FindBy(id = "main_img")
	WebElement chooseFile;
	@FindBy(id = "link")
	WebElement link;
	@FindBy(name = "create")
	WebElement SaveButton;
	@FindBy(xpath = "//i[@class='icon fas fa-check']")
	WebElement Alert;

	public void clickmobileSlider() throws Exception {
		ClickActionHelper.click(driver, mobileSlider);
	}

	public String getTitleOfPage() {
		return gu.getTitleText(driver);
	}

	public void clickNewButton() throws Exception {
		ClickActionHelper.click(driver, NewButton);
	}
	public String getTitleOfAddSliderPage() {
		return gu.getTitleText(driver);
	}

	public void clickChooseFile() throws Exception {
		ClickActionHelper.click(driver, chooseFile);
	}

	public void uploadImage() throws AWTException {
		gu.fileUpload(System.getProperty("user.dir") + ("\\src\\main\\resources\\uploadFiles\\xxxxx.docx"));
	}

	public String enterlink(String Links) {
		link.sendKeys(Links);
		return Links;
		
	}

	public void clickSaveButton() throws Exception {
		ClickActionHelper.click(driver, SaveButton);
	}

	public String verifyAlertMessage() {
		return gu.getAlertText(driver);
	}

}
