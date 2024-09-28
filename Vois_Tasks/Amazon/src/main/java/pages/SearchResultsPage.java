package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageBase {
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "(//button[normalize-space()='Add to cart'])[1]")
	WebElement addToCartButtn;
	
 
	@FindBy(css = "div.a-changeover-inner")
	public WebElement addedItemMessage;

	public void addProductToCart() {
		clickButton(addToCartButtn);	
	}
	

}
