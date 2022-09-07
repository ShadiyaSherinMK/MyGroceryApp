package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickActionHelper {
	
	public static void click(WebDriver driver, WebElement element) throws Exception
	{
		try {
			Actions act=new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}
		catch(Exception e) {
			throw new Exception("click (ClickActionHelper) : "+e.getMessage());
		}
	}

}
