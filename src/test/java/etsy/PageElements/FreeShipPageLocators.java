package etsy.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeShipPageLocators {
	
			//Select 'Free Shipping' box
			
			@FindBy (xpath="//label[contains(text(),'FREE shipping')]")
			public WebElement SelectFreeShip;
			

}
