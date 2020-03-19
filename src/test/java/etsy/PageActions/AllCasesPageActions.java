package etsy.PageActions;

import org.testng.Assert;

import etsy.utilities.SetupDrivers;

public class AllCasesPageActions {
	
	public String verifyCasePage(){
		
		
		SetupDrivers.driver.getCurrentUrl();
		String trueURL = SetupDrivers.driver.getCurrentUrl();
		return trueURL;
		
	}

}
