package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productDetailsPage extends PageBase {

	public productDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="add-to-cart-button")
	WebElement addTOCartButtn;
	
	public void addProductToCart() {
		clickButton(addTOCartButtn);
	}

}
