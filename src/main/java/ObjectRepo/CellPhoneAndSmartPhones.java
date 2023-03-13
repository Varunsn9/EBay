package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhoneAndSmartPhones {

	public CellPhoneAndSmartPhones(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//span[.='Screen Size']")
	private WebElement Screen_Size;

	@FindBy(xpath="//span[@class='b-pageheader__text']")
	private WebElement pageHeader;
	
	public WebElement getPageHeader() {
		return pageHeader;
	}

	public void setPageHeader(WebElement pageHeader) {
		this.pageHeader = pageHeader;
	}

	@FindBy(xpath="//form[@id='x-overlay__form']/descendant::span[.='Price']")
	private WebElement Price;
	
	@FindBy(xpath="//input[@aria-label='Minimum Value, US Dollar']")
	private WebElement minValue;
	
	@FindBy(xpath="//input[@aria-label='Maximum Value, US Dollar']")
	private WebElement maxValue;
	

	@FindBy(xpath="//span[.='Item Location']")
	private WebElement item_Location;

	@FindBy(xpath="//input[@value='US Only']")
	private WebElement us_Only_Button;
	
	public WebElement getItem_Location() {
		return item_Location;
	}

	public void setItem_Location(WebElement item_Location) {
		this.item_Location = item_Location;
	}

	public WebElement getUs_Only_Button() {
		return us_Only_Button;
	}

	public void setUs_Only_Button(WebElement us_Only_Button) {
		this.us_Only_Button = us_Only_Button;
	}

	public WebElement getPrice() {
		return Price;
	}

	public void setPrice(WebElement price) {
		Price = price;
	}

	public WebElement getMinValue() {
		return minValue;
	}

	public void setMinValue(WebElement minValue) {
		this.minValue = minValue;
	}

	public WebElement getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(WebElement maxValue) {
		this.maxValue = maxValue;
	}

	@FindBy(xpath="//*[@id=\"x-overlay__form\"]/div[3]/div[2]/button")
	private WebElement filterApply;
	
	public WebElement getFilterApply() {
		return filterApply;
	}

	public void setFilterApply(WebElement filterApply) {
		this.filterApply = filterApply;
	}

	@FindBy(xpath="//fieldset/descendant::span[@class='field']")
	private WebElement Screen_Size_5_0_to_5_4;
	
	
	public WebElement getScreen_Size() {
		return Screen_Size;
	}

	public void setScreen_Size(WebElement screen_Size) {
		Screen_Size = screen_Size;
	}

	public WebElement getScreen_Size_5_0_to_5_4() {
		return Screen_Size_5_0_to_5_4;
	}

	public void setScreen_Size_5_0_to_5_4(WebElement screen_Size_5_0_to_5_4) {
		Screen_Size_5_0_to_5_4 = screen_Size_5_0_to_5_4;
	}

	@FindBy(xpath="//h2[.='Shop by Brand']/ancestor::div/descendant::span[.='- Shop by Brand']/preceding-sibling::span")
	private WebElement Shop_by_Brand_See_All;

	
	public WebElement getShop_by_Brand_See_All() {
		return Shop_by_Brand_See_All;
	}

	public void setShop_by_Brand_See_All(WebElement shop_by_Brand_See_All) {
		Shop_by_Brand_See_All = shop_by_Brand_See_All;
	}
}
