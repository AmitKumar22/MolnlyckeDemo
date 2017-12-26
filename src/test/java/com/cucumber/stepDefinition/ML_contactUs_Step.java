package com.cucumber.stepDefinition;

import com.cucumber.businessLogic.ML_ContactUs_Logic;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ML_contactUs_Step {
	ML_ContactUs_Logic contactUs;

	@When("^User click on Contact Us Link$")
	public void user_click_on_Contact_Us_Link() throws Exception {
		contactUs = new ML_ContactUs_Logic();
		contactUs.clickContactUsLink();
	}

	@Then("^Contact Us form should be displayed\\.$")
	public void contact_Us_form_should_be_displayed() throws Exception {

	}

	@And("^Verify \"([^\"]*)\" heading$")
	public void verify_heading(String txtheading) throws Exception {
			contactUs.verifyContactMolnlyckeHeading(txtheading);
	}

	@When("^User enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter(String country, String email, String message, String captcha) throws Exception {
		contactUs.enterCountry(country);
		contactUs.enterEmail(email);
		contactUs.enterMessage(message);
		contactUs.enterCaptcha(captcha);
	}

	@And("^Select consent$")
	public void select_consent() throws Exception {
		contactUs.selectConsent();
	}

	@And("^User click send button$")
	public void user_click_send_button() throws Exception {
		contactUs.clickSendButton();
	}

	@Then("^Verify the error message \"([^\"]*)\" should be displayed under Catpcha$")
	public void verify_the_error_message_should_be_displayed_under_Catpcha(String errorMsg) throws Exception {
		contactUs.verifyCaptchaErrorMsg(errorMsg);
	}

}
