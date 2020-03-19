package etsy.PageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import etsy.PageElements.EtsyHomePageLocators;
import etsy.utilities.SetupDrivers;

public class EtsyHomePageAction {
	
	EtsyHomePageLocators etsyHomeLocators;

	public EtsyHomePageAction(){
		
	etsyHomeLocators = new EtsyHomePageLocators();
	PageFactory.initElements(SetupDrivers.driver, etsyHomeLocators);

	}
	
	public void launchEtsyHomepage() {
		
		SetupDrivers.driver.get("https://www.etsy.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}
	
	public void typePhoneCase()  {
		
		etsyHomeLocators.textPhoneCase.sendKeys("iphone case");

	}	
		
	public void searchPhoneCase(){
		
		etsyHomeLocators.SearchButton.click();
	}
}
