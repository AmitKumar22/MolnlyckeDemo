package com.cucumber.stepDefinition;

import com.cucumber.businessLogic.ML_AboutUs_Logic;
import com.cucumber.utilityCommon.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ML_aboutUs_Step {

	ML_AboutUs_Logic aboutUs;

	@When("^User mouse over the About Us menu$")
	public void user_mouse_over_the_About_Us_menu() throws Exception {
		aboutUs = new ML_AboutUs_Logic();
		aboutUs.mouseOverAboutUs();
	}

	@Then("^About Us menu should expand verify heading \"([^\"]*)\"$")
	public void about_Us_menu_should_expand_verify_heading(String arg1) throws Exception {
		aboutUs.verifySubAboutUsHeading(arg1);
	}

	@And("^Verify sub menu headings \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"\\. \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void verify_sub_menu_headings(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
			String arg7) throws Exception {
		aboutUs.verifyOurHistorySubMenu(arg1);
		aboutUs.verifyOurGovernanceSubMenu(arg2);
		aboutUs.verifySustainabilitySubMenu(arg3);
		aboutUs.verifyMolnlyckeInNumbersSubMenu(arg4);
		aboutUs.verifyGlobalCompanySubMenu(arg5);
		aboutUs.verifyPartneringSubMenu(arg6);
		aboutUs.verifyBuildingClinicalSubMenu(arg7);
	}

	@After
	public static void embedScreenshot(Scenario scenario) throws Exception {
		CommonMethods.onFailureSnapshot(scenario);
	}

}
