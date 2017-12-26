package com.cucumber.businessLogic;

import com.cucumber.pageObjects.ML_ContactUs_PageObjects;
import com.cucumber.utilityCommon.CommonMethods;

public class ML_ContactUs_Logic extends CommonMethods {

	public ML_ContactUs_Logic clickContactUsLink() {
		CommonMethods.waitForMilliSeconds("2");
		ML_ContactUs_PageObjects.hdg_ContactUs(driver).click();
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic verifyContactMolnlyckeHeading(String txtheading) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_ContactUs_PageObjects.hdg_ContactMolnlycke(driver), txtheading);
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic enterCountry(String country) {
		CommonMethods.waitForMilliSeconds("2");
		ML_ContactUs_PageObjects.txtBox_YourCountry(driver).sendKeys(country);
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic enterEmail(String email) {
		CommonMethods.waitForMilliSeconds("2");
		ML_ContactUs_PageObjects.txtBox_Email(driver).sendKeys(email);
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic enterMessage(String message) {
		CommonMethods.waitForMilliSeconds("2");
		ML_ContactUs_PageObjects.txtBox_Message(driver).sendKeys(message);
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic selectConsent() {
		CommonMethods.waitForMilliSeconds("2");
		ML_ContactUs_PageObjects.chkBox_Consent(driver).click();
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic enterCaptcha(String captcha) {
		CommonMethods.waitForMilliSeconds("2");
		ML_ContactUs_PageObjects.txtBox_Captcha(driver).sendKeys(captcha);
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic clickSendButton() {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.scrollingToElementofAPage(ML_ContactUs_PageObjects.txtBox_YourCountry(driver));
		CommonMethods.waitForMilliSeconds("3");
		ML_ContactUs_PageObjects.btn_Send(driver).click();
		return new ML_ContactUs_Logic();
	}

	public ML_ContactUs_Logic verifyCaptchaErrorMsg(String errorMsg) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_ContactUs_PageObjects.txt_CaptchaErroMsg(driver), errorMsg);
		return new ML_ContactUs_Logic();
	}
}
