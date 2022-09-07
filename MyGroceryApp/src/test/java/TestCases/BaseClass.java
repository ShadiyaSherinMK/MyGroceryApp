package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utilities.CaptureScreenShot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	WebDriver driver;
	CaptureScreenShot cps;
	public static Properties prop;

	public static void testBasic() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
			System.getProperty("user.id") + "\\src\\main\\\resources\\properties\\config.properties\\");	
		prop.load(ip);
			}
	
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Downloads\\msedgedriver.exe");
			driver = new EdgeDriver();

		}

		 driver.get("https://groceryapp.uniqassociates.com/admin/login");
		//driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void afterMethod(ITestResult itestResult) throws IOException {
		if (itestResult.getStatus() == ITestResult.FAILURE) {// Listener
			cps = new CaptureScreenShot();
			cps.screenshotCapture(driver, itestResult.getName());
		}

	}

}
