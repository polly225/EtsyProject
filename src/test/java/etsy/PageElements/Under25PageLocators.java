package etsy.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Under25PageLocators {
	
	//Select 'Under $25' box
	
	@FindBy (xpath="//span[contains(text(),'Under $25')]")
	public WebElement Select25;

}
