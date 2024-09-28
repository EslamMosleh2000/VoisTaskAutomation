package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AvaliableTripsOptionsPage extends PageBase {

	public AvaliableTripsOptionsPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	
	@FindBy(css="div.selectbutton")
	WebElement selectSeatButtn;
	
	@FindBy(css="div.seatlook")
	WebElement randomSeat;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/"
			+ "div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]")
	WebElement boardingPointOption;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]"
			+ "/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]")
	WebElement droppinhPointList;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]"
			+ "/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div")
	WebElement droppingPointOption;
	
	@FindBy(css="div.btnPassDetails")
	WebElement passengerDetailsButtn;
	
	@FindBy(name = "mobileNo")
	WebElement mobileNumberField;
	
	@FindBy(name = "email")
	WebElement emailField;
	
	@FindBy(xpath = "//div[text()='PROCEED TO passenger detail as']")
	WebElement proceedAsGuestButtn;
	
	@FindBy(name="paxName[0]")
	WebElement passengerNameField;
	
	@FindBy(name = "paxGender[0]")
	WebElement genderList;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/"
			+ "div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[2]")
	WebElement genderOption;
	
	@FindBy(name="paxAge[0]")
	WebElement ageField;
	
	@FindBy(name="paxConcessionType[0]")
	WebElement concessionList;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]"
			+ "/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[2]")
	WebElement concessionOption;
	
	@FindBy(xpath="//div[text()='Proceed to Checkout']")
	WebElement proceedToCheckoutButtn;
	
	
	
	public void goToSeatSelectionPage() {
		clickButton(selectSeatButtn);
	}
	
	public void selectRandomSeat() {
		clickButton(randomSeat);
		clickButton(boardingPointOption);
		clickButton(droppinhPointList);
		clickButton(droppingPointOption);
		clickButton(passengerDetailsButtn);
	}
	
	public void fillCustomerInformation(String mobileNumber,String email) {
		setTextForElementText(mobileNumberField, mobileNumber);
		setTextForElementText(emailField, email);
		clickButton(proceedAsGuestButtn);
	}
	
	public void fillPassengerInformation(String name,String Age) {
		setTextForElementText(passengerNameField, name);
		clickButton(genderList);
		clickButton(genderOption);
		setTextForElementText(ageField, Age);
		clickButton(concessionList);
		clickButton(concessionOption);
		clickButton(proceedToCheckoutButtn);
	}
	
}
