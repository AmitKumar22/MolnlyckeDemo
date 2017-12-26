package com.cucumber.stepDefinition;

import com.cucumber.businessLogic.ML_SelectMkt_Norway_Logic;
import com.cucumber.utilityCommon.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ML_SelectMkt_Norway_Step {

	ML_SelectMkt_Norway_Logic selectmktnorway;

	@When("^User Click on Select Market link and click on Norway link$")
	public void user_Click_on_Select_Market_link_and_click_on_Norway_link() throws Exception {
		selectmktnorway = new ML_SelectMkt_Norway_Logic();
		selectmktnorway.clickSelectMarketHeading();
		selectmktnorway.clickNorwayLink();
	}

	@Then("^Norwegian \"([^\"]*)\" Molnlycke main page should be displayed with \"([^\"]*)\"$")
	public void norwegian_Molnlycke_main_page_should_be_displayed_with(String arg1, String arg2) throws Exception {
		CommonMethods.verifyPageTitle(arg2);
		selectmktnorway.verifyNorwayText(arg1);

	}

	@And("^Norwegian headings should be \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on the top of the page\\.$")
	public void norwegian_headings_should_be_on_the_top_of_the_page(String arg1, String arg2, String arg3, String arg4,
			String arg5, String arg6, String arg7) throws Exception {

		selectmktnorway.verifyVåreLøsningerLink(arg1);
		selectmktnorway.verifyProdukterServiceLink(arg2);
		selectmktnorway.verifyKunnskapLink(arg3);
		selectmktnorway.verifyUndervisningLink(arg4);
		selectmktnorway.verifyNyheterMediaLink(arg5);
		selectmktnorway.verifyOmOssLink(arg6);
		selectmktnorway.verifyForPrivatkunderLink(arg7);
	}

}
