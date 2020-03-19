package etsy.PageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import etsy.PageElements.FreeShipPageLocators;
import etsy.utilities.SetupDrivers;

public class FreeShipPageActions {
	
	
	FreeShipPageLocators freeShip;

	public FreeShipPageActions(){
		
	freeShip = new FreeShipPageLocators();
	PageFactory.initElements(SetupDrivers.driver, freeShip);
	
	}
	
public void launchPhoneCasePage() throws Exception{
		
	
		SetupDrivers.driver.get("https://www.etsy.com/search?q=iphone%20case");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void selectFreeShip(){
		
		freeShip.SelectFreeShip.click();
		
		
	}
}


