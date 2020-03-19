package etsy.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import etsy.PageActions.EtsyHomePageAction;
import etsy.PageActions.ScrollDownPageActions;

public class ScrollDownSteps {
	
	ScrollDownPageActions objScroll = new ScrollDownPageActions();
	
	

	@When("^User scrolls down to bottom of homepage$")
	public void user_scrolls_down_to_bottom_of_homepage() throws Throwable {
	  
		objScroll.scrolltoBottom();
	}

	@When("^User navigates to Help Center$")
	public void user_navigates_to_Help_Center() throws Throwable {
	  
		objScroll.clickHelpBtn();
	}


	@Then("^Verify Help Center page appears\\.$")
	public void verify_Help_Center_page_appears() throws Throwable {
	   
	}


}
