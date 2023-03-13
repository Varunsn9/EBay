package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public WebDriverUtility wUtil=new WebDriverUtility();
	
	@BeforeMethod
	public void beforeMethod() {
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			wUtil.implicitlyWaiting(driver,10);
			driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
