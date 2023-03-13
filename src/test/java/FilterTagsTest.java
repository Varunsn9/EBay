import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseClass;
import ObjectRepo.CellPhoneAndAccesssories;
import ObjectRepo.CellPhoneAndSmartPhones;
import ObjectRepo.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FilterTagsTest extends BaseClass {

	
	
	@Test
	public void FilterTagTest() {
		
	CellPhoneAndAccesssories cellPhoneAndAccesssories=new CellPhoneAndAccesssories(driver);
	HomePage homePage=new HomePage(driver);
	wUtil.moveToElement(driver, homePage.getElectronics());
	homePage.getSmartPhone_And_Accessories().click();
	cellPhoneAndAccesssories.getCellPhoneAndSmartPhone().click();
	CellPhoneAndSmartPhones cellPhoneAndSmartPhones=new CellPhoneAndSmartPhones(driver);
	cellPhoneAndSmartPhones.getShop_by_Brand_See_All().click();
	cellPhoneAndSmartPhones.getScreen_Size().click();
	cellPhoneAndSmartPhones.getScreen_Size_5_0_to_5_4().click();
	cellPhoneAndSmartPhones.getPrice().click();
	cellPhoneAndSmartPhones.getMinValue().sendKeys("100");
	cellPhoneAndSmartPhones.getMaxValue().sendKeys("500");
	cellPhoneAndSmartPhones.getItem_Location().click();
	cellPhoneAndSmartPhones.getUs_Only_Button().click();
	cellPhoneAndSmartPhones.getFilterApply().click();
	String currentTitle=driver.getTitle();
	String expectedString="4.0 - 4.4 Inch Cell Phones & Smartphones between US $100.00 and US $500.00";
	wUtil.expectedConditionWait(driver, currentTitle);
	Assert.assertEquals(cellPhoneAndSmartPhones.getPageHeader().getText(), expectedString);

	}
	@Test
	public void pageLoadAndFirstSearchText() throws Throwable{
		
		String searchText="MacBook";
		String option="Computers/Tablets & Networking";
		String expectedTitle="MacBook in Computers/Tablets & Networking for sale | eBay";
		
		HomePage homePage=new HomePage(driver);
		homePage.getSearchBox().sendKeys(searchText);
		homePage.getAll_Categories().click();
		wUtil.SelectByText(homePage.getAll_Categories(),option);
		homePage.getSearchButton().click();
		wUtil.waitForPageToLoad(driver, expectedTitle);
		String firstSearchResult=driver.findElement(By.xpath("//div[@id='srp-river-results']/descendant::div[@class='s-item__title']/descendant::span")).getText();
		System.out.println(firstSearchResult);
		System.out.println(searchText);
		
		Assert.assertTrue(firstSearchResult.contains(searchText),"searchText is not Matching"+driver.getTitle());
		
	}
}
