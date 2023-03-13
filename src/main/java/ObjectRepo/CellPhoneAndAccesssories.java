package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhoneAndAccesssories {

	@FindBy(xpath="//h2[.='Shop by Category']/ancestor::div/following-sibling::ul/descendant::a[.='Cell Phones & Smartphones']")
	private WebElement cellPhoneAndSmartPhone;

	public WebElement getCellPhoneAndSmartPhone() {
		return cellPhoneAndSmartPhone;
	}

	public void setCellPhoneAndSmartPhone(WebElement cellPhoneAndSmartPhone) {
		this.cellPhoneAndSmartPhone = cellPhoneAndSmartPhone;
	}
	public CellPhoneAndAccesssories(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
