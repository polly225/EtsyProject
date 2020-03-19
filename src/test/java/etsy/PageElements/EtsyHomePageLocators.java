package etsy.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EtsyHomePageLocators {

		//Type 'Iphone case' in search tab 
		@FindBy (xpath="//input[@id='global-enhancements-search-query']")
		public WebElement textPhoneCase;
		
		//WebElement Search Button
		@FindBy(xpath="//button[@class='wt-input-btn-group__btn']") // Initiated xpath
		public WebElement SearchButton;
		

}
