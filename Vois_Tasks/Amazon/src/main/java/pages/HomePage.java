package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="twotabsearchtextbox")
	WebElement searchtxtBox;
	
	@FindBy(id ="nav-search-submit-button")
	WebElement searchButtn;
	
	@FindBy(id="nav-cart")
	WebElement shoppingCart;
	
	@FindBy(css="input.a-button-input")
	WebElement countryAddressDismissButtn;
	
	@FindBy(linkText = "Today's Deals")
	WebElement todayDealsLink;
	
	

	
	public void searchForProduct(String productName) {
		setTextForElementText(searchtxtBox, productName);
		clickButton(searchButtn);
	}
	
	public void goToCart() {
		clickButton(shoppingCart);
	}
	
	public void dismissCounrtyAdrress() {
		clickButton(countryAddressDismissButtn);
	}
	
	public void  goToTodayDealsPaage() {
		clickButton(todayDealsLink);
	}
	

}
