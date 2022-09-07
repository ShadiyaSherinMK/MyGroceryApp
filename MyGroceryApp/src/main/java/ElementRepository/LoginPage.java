package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;


public class LoginPage {
	WebDriver driver;
	
	GeneralUtilities gu=new GeneralUtilities() ;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	WebElement userName;
	@FindBy(name="password")
	WebElement passWord;
	@FindBy(xpath=" //button[@class='btn btn-primary btn-block']")
	WebElement loginButton;
	
	public String getTextOfLoginButton() {
		return gu.getElementText(loginButton);
	}
	
	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
	public void enterPassWord(String password) {
		passWord.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}

	public void performLogin(String username,String password) {
		enterUserName(username);
		enterPassWord(password);
		clickLoginButton();
		
	}

}
