package com.cucumber.businessLogic;

import com.cucumber.pageObjects.ML_MainPage_PageObjects;
import com.cucumber.utilityCommon.CommonMethods;

public class ML_MainPage_Logic extends CommonMethods {

	public ML_MainPage_Logic clickIagree() {
		CommonMethods.waitForMilliSeconds("5");
		ML_MainPage_PageObjects.btn_Iagree(driver).click();
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifyLogoSource(String logoSrc) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTxtContains(ML_MainPage_PageObjects.img_Monlnlycke(driver).getAttribute("src"), logoSrc);
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifySelectMarketHeading(String heading1) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTextUpperCase(ML_MainPage_PageObjects.hdg_SelectMarket(driver), heading1);
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifyContactUsHeading(String heading2) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTextUpperCase(ML_MainPage_PageObjects.hdg_ContactUs(driver), heading2);
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifySearchHeading(String heading3) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTextUpperCase(ML_MainPage_PageObjects.hdg_Search(driver), heading3);
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifyAboutUsMenu(String menu1) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTextUpperCase(ML_MainPage_PageObjects.mnu_AboutUs(driver), menu1);
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifyProductAndSolutionMenu(String menu2) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTextUpperCase(ML_MainPage_PageObjects.mnu_ProdAndSol(driver), menu2);
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifyCareerMenu(String menu3) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTextUpperCase(ML_MainPage_PageObjects.mnu_Careers(driver), menu3);
		return new ML_MainPage_Logic();
	}

	public ML_MainPage_Logic verifyNewsMenu(String menu4) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTextUpperCase(ML_MainPage_PageObjects.mnu_News(driver), menu4);
		return new ML_MainPage_Logic();
	}
}
