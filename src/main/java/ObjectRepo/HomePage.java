package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 @FindBy(xpath = "//*[@id=\"gh-cat\"]")
	    private WebElement all_Categories;

	 @FindBy(xpath = "//input[@id='gh-ac']")
	    private WebElement SearchBox;
	 
	 @FindBy(xpath = "//input[@value='Search']")
	    private WebElement SearchButton;
	 
	 

	 public WebElement getSearchButton() {
		return SearchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		SearchButton = searchButton;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public void setSearchBox(WebElement searchBox) {
		SearchBox = searchBox;
	}

	@FindBy(xpath = "//li[@class='saved']/parent::ul/child::li/child::a[.='Electronics']")
	    private WebElement electronics;
	 
	 @FindBy(xpath = "//a[.='Smartphones and accessories']")
	    private WebElement smartPhone_And_Accessories;

	    public WebElement getSmartPhone_And_Accessories() {
		return smartPhone_And_Accessories;
	}

	public void setSmartPhone_And_Accessories(WebElement smartPhone_And_Accessories) {
		this.smartPhone_And_Accessories = smartPhone_And_Accessories;
	}

		public WebElement getElectronics() {
		return electronics;
	}

	public void setElectronics(WebElement electronics) {
		this.electronics = electronics;
	}

		public WebElement getAll_Categories() 
	    {
		return all_Categories;
	    }

	public void setAll_Categories(WebElement all_Categories) {
		this.all_Categories = all_Categories;
	}

		public HomePage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    
}
