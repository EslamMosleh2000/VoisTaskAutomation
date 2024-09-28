package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TodayDealsPAge extends PageBase {

	public TodayDealsPAge(WebDriver driver) {
		super(driver);	
		action = new Actions(driver);
		
	}
	
	@FindBy(linkText = "See more")
	WebElement seeAllDepartmentbuttn;
	
	@FindBy(xpath="//div[@data-csa-c-element-id="
			+ "'filter-departments-Grocery & Gourmet Food']")
	WebElement groceryFilteretionButtn;
	
	@FindBy(xpath="//div[@data-csa-c-element-id="
			+ "'filter-percentOff-10% off or more']")
	WebElement discountOfTenButtn;
	
	
	@FindBy(id="accessType")
	WebElement accessTypeList;
	
	@FindBy(id= "brands")
	public WebElement brandsList;
	

	@FindBy(xpath = "(//span[contains(@class, 'a-truncate-cut')])[4]")
	WebElement randomProductFromDeals;
	
	
	public void seeFilterationResults() {
		clickButton(seeAllDepartmentbuttn);
		clickButton(groceryFilteretionButtn);
		
	}
	
	public void filterUsingDiscountTen() {
		action.moveToElement(brandsList);
		action.scrollToElement(accessTypeList).build().perform();
		clickButton(discountOfTenButtn);	
	}
	
	public void selectRandomProduct() {
		clickButton(randomProductFromDeals);
	}
	
}
