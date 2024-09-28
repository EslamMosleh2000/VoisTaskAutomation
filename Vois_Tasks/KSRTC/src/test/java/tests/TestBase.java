package tests;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	
	@BeforeSuite
	public void startDriver(){
		driver = new ChromeDriver();
		
		Duration duration = Duration.ofSeconds(4);
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.manage().timeouts().implicitlyWait(duration);
		driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	}
	
	@AfterSuite
	public void endDriver() {
		driver.quit();
	}
	


}
