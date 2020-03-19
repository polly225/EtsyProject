package etsy.PageActions;

import org.openqa.selenium.support.PageFactory;
import etsy.PageElements.Under25PageLocators;
import etsy.utilities.SetupDrivers;

public class Under25PageActions {
	

	private Under25PageLocators under25Box;

	public Under25PageActions(){
	this.under25Box = new Under25PageLocators();
	PageFactory.initElements(SetupDrivers.driver, under25Box);
	
	}
	
		public void select25Box(){
			
			under25Box.Select25.click();
		
	}

}
