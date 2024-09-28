package tests;



import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.TodayDealsPAge;
import pages.productDetailsPage;

public class Task1 extends TestBase {

	Duration duration = Duration.ofSeconds(10);
	WebDriverWait wait = new WebDriverWait(driver, duration);
			
	HomePage homeObject;
	SearchResultsPage searchResultObject;
	TodayDealsPAge todayDealsObject;
	CartPage cartObject;
	productDetailsPage productDetailsobject;
	

	@Test
	public void Scenario1() {
		homeObject = new HomePage(driver);
		searchResultObject = new SearchResultsPage(driver);
		cartObject = new CartPage(driver);
		
		homeObject.searchForProduct("car accessories");
		searchResultObject.addProductToCart();
		wait.until(ExpectedConditions.visibilityOf(searchResultObject.addedItemMessage));
		Assert.assertEquals(searchResultObject.addedItemMessage.getText(), "Item Added");
		wait.until(ExpectedConditions.invisibilityOf(searchResultObject.addedItemMessage));
		homeObject.goToCart();
		Assert.assertTrue(cartObject.numberOFItemsText.getText().contains("1 item"));	
	}
	
	
	@Test
	public void Scenario2() {
		homeObject = new HomePage(driver);
		todayDealsObject = new TodayDealsPAge(driver);
		searchResultObject = new SearchResultsPage(driver);
		productDetailsobject = new productDetailsPage(driver);
		
		homeObject.dismissCounrtyAdrress();
		homeObject.goToTodayDealsPaage();
		todayDealsObject.seeFilterationResults();
		wait.until(ExpectedConditions.visibilityOf(todayDealsObject.brandsList));
		todayDealsObject.filterUsingDiscountTen();
		todayDealsObject.selectRandomProduct();
		productDetailsobject.addProductToCart();
		homeObject.goToCart();	
	}
	

}
