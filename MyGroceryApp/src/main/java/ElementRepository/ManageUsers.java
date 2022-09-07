package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ClickActionHelper;
import Utilities.GeneralUtilities;

public class ManageUsers {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	ClickActionHelper cah=new ClickActionHelper();
			
	
	public ManageUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-user']")
WebElement ManageUserTab;
@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]//td[3]")
WebElement ShowTab;
@FindBy(xpath="//div[@class='profile-info-name']//span[text()='admin123']")
WebElement details;
@FindBy(xpath="//h1[text()='List Users']")
WebElement listUser;




public void clickManageUserTab() throws Exception {
	ClickActionHelper.click(driver,ManageUserTab );
}
public String verifytitle() {
	return gu.getTitleText(driver);
}
public void clickShowTab() {
	 ShowTab.click();
	 
		 
}
public boolean verifyDetails() {
	return gu.isValueDisplayed(ShowTab);

}

}
