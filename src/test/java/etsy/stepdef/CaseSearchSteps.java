package etsy.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import etsy.PageActions.AllCasesPageActions;
import etsy.PageActions.EtsyHomePageAction;

public class CaseSearchSteps {
	
	EtsyHomePageAction openEtsy = new EtsyHomePageAction();
	AllCasesPageActions verifyCurrent = new AllCasesPageActions();
	
	@Given("^User browse to etsy web application$")
	public void user_browse_to_etsy_web_application() throws Throwable {
	    
		openEtsy.launchEtsyHomepage();
	}

	@When("^User types in iphone case on search tab$")
	public void user_types_in_iphone_case_on_search_tab() throws Throwable {
	    
		openEtsy.typePhoneCase();
	}

	@Then("^User clicks on search button on the right hand side$")
	public void user_clicks_on_search_button_on_the_right_hand_side() throws Throwable {
	   
		openEtsy.searchPhoneCase();
	}

	@Then("^Verify all types of iphone cases appears on page\\.$")
	public void verify_all_types_of_iphone_cases_appears_on_page() throws Throwable {
	   
		verifyCurrent.verifyCasePage();
	}



}
