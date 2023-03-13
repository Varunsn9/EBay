package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;
 
public class WebDriverUtility {

	public void moveToElement(WebDriver driver,WebElement element) {
	Actions action=new Actions(driver);
	action.moveToElement(element);
	action.perform();
	}
	
	public void SelectByText(WebElement element,String text) {
		org.openqa.selenium.support.ui.Select select=new org.openqa.selenium.support.ui.Select(element);
		select.selectByVisibleText(text);
	}
	
	public void implicitlyWaiting(WebDriver driver,int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
	}
	
	/**
	 * title not equals to condition
	 * @param driver
	 * @param condition
	 */
	public void expectedConditionWait(WebDriver driver,String condition) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.not(ExpectedConditions.titleIs(condition)));
		
	}
	
	public void waitForPageToLoad(WebDriver driver, String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleContains(expectedTitle));
    }
}
