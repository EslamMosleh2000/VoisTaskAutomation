package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}


	@FindBy(css="div.book-btn")
	WebElement popularDestinationName;
	
	@FindBy(linkText = "30")
	WebElement bookDaySelect;
	
	@FindBy(xpath="//*[@id=\"outerWrapper\"]/div[3]/footer/div[1]/div[1]/h1")
	WebElement relatedLinksTxt;


	public void selectTripFromBengaluruToChikkamagaluru() {
		action.scrollToElement(relatedLinksTxt)
				.moveToElement(popularDestinationName)
				.click().build().perform();
		clickButton(bookDaySelect);
	}


}
