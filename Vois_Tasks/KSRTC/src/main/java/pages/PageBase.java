package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected static WebDriver driver;
	public Actions action;
	
	public PageBase (WebDriver driver) {	
		PageFactory.initElements(driver, this);	
	}
	
	protected static void clickButton(WebElement button) {
		button.click();
	}
	
	protected static void setTextForElementText(WebElement txtBox, String value) {
		txtBox.sendKeys(value);	
	}
	
}
