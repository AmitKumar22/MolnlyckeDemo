package com.cucumber.stepDefinition;

import com.cucumber.businessLogic.ML_Search_Logic;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ML_search_Step {

	ML_Search_Logic search;

	@When("^User click on Search Link$")
	public void user_click_on_Search_Link() throws Exception {
		search = new ML_Search_Logic();
		search.clickSearchLink();
	}
	
	@Then("^Verify heading \"([^\"]*)\" on search page$")
	public void verify_heading_on_search_page(String arg1) throws Exception {
		search.verifyImLookingForHeading(arg1);
	}

	@When("^User enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Exception {
		search.enterSearchText(arg1);
	}

	@Then("^Click on search buton$")
	public void click_on_search_buton() throws Exception {
		search.clickSendButton();
	}

	@And("^Search page \"([^\"]*)\" should be displayed$")
	public void search_page_should_be_displayed(String arg1) throws Exception {
		search.verifySearchPageTitle(arg1);
	}

	@And("^Verify searched text \"([^\"]*)\"$")
	public void verify_searched_text(String arg1) throws Exception {
		search.verifySearchedText(arg1);
	}

	@When("^Click on link \"([^\"]*)\"$")
	public void click_on_link(String arg1) throws Exception {
		search.clickOnLink_BiogelGloves();
	}

	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Exception {
		search.verifySearchPageTitle(arg1);
	}

}
