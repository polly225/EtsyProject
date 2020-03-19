package etsy.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import etsy.PageActions.FreeShipPageActions;
import etsy.PageActions.Under25PageActions;

public class Free25Steps {
	
	FreeShipPageActions openCasePage = new FreeShipPageActions();
	Under25PageActions nextCasePage = new Under25PageActions();
	
	@Given("^User is already on iphone case items page$")
	public void user_is_already_on_iphone_case_items_page() throws Throwable {
	 
		openCasePage.launchPhoneCasePage();
	}

	@When("^User selects free shipping box on right hand side\\.$")
	public void user_selects_free_shipping_box_on_right_hand_side() throws Throwable {
		
		openCasePage.selectFreeShip();
	
	}

	@When("^User selects items under twenty five box on right hand side\\.$")
	public void user_selects_items_under_twenty_five_box_on_right_hand_side() throws Throwable {
	
		nextCasePage.select25Box();
	}

	@Then("^User should see all iphone cases with free shipping and under twenty five dollars appear on page\\.$")
	public void user_should_see_all_iphone_cases_with_free_shipping_and_under_twenty_five_dollars_appear_on_page() throws Throwable {
	  
	}



}
