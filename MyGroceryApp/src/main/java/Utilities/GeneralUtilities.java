package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;

	}
	public String getTitleText(WebDriver driver) {
		String text1=driver.getTitle();
		return text1;
	}
	 
	

	public String selectFromDropDown(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		WebElement selectedValue = s.getFirstSelectedOption();
		String selectedValuesText = selectedValue.getText();
		return selectedValuesText;

	}

	public String getStyleProperties(WebElement element, String propertyType) {
		return element.getCssValue(propertyType);

	}

	public String getAlertText(WebDriver driver) {
		String alertText = driver.switchTo().alert().getText();
		return alertText;

	}

	public String getAttributeValue(WebElement element, String attributType) {
		String value = element.getAttribute(attributType);
		return value;
	}

	public boolean isSelectFromRadio(WebElement element) {
		boolean b = element.isSelected();
		return b;
	}

	public boolean isValueDisplayed(WebElement element) {
		boolean d = element.isSelected();
		return d;
	}

	public void fileUpload(String path) throws AWTException {
		StringSelection ss = new StringSelection("C:\\Users\\User\\Documents\\Women aged 17.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(250);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
