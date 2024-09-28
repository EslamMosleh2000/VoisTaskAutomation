package tests;

import org.testng.annotations.Test;

import pages.AvaliableTripsOptionsPage;
import pages.HomePage;

public class BookTripTest extends TestBase {
	
	HomePage homeObject;
	AvaliableTripsOptionsPage tripOptionObject;
	
	String mobileNumber="6789125987";
	String email ="eslam1@gmail.com";
	String name ="Eslam Mosleh";
	String age = "24";
	
	@Test
	public void bookTrip() {
		homeObject = new HomePage(driver);
		tripOptionObject = new AvaliableTripsOptionsPage(driver);
		
		homeObject.selectTripFromBengaluruToChikkamagaluru();
		tripOptionObject.goToSeatSelectionPage();
		tripOptionObject.selectRandomSeat();
		tripOptionObject.fillCustomerInformation(mobileNumber,email);
		tripOptionObject.fillPassengerInformation(name,age);
		
	}

}
