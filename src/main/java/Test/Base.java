package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Base extends ExtendsReport{
	
	
	public static WebDriver driver;
	@BeforeTest
	public static WebDriver getDriver() {
		ExtentTest test = extent.createTest("Automation Exercise E-commerce Application", "Test Case 1");
	    test.log(Status.INFO, "Test Case 1");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Scalably\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.geckodriver.driver","C:\\Users\\user\\Desktop\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		capabilities.setCapability("marionette", true);
		driver = new ChromeDriver(capabilities);
		//driver = new FirefoxDriver(capabilities);
		driver.get("https://automationexercise.com/");
		test.log(Status.INFO, "Navigate to url ");
		driver.manage().window().maximize();
		
		
		return driver;
	}

}
