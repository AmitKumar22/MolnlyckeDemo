package com.cucumber.businessLogic;

import com.cucumber.pageObjects.ML_AboutUs_PageObjects;
import com.cucumber.pageObjects.ML_MainPage_PageObjects;
import com.cucumber.utilityCommon.CommonMethods;

public class ML_AboutUs_Logic extends CommonMethods {

	public ML_AboutUs_Logic mouseOverAboutUs() {
		CommonMethods.waitForMilliSeconds("2");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx Verify sub menu xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		CommonMethods.mouseOverElement(ML_MainPage_PageObjects.mnu_AboutUs(driver));
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifySubAboutUsHeading(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.subhng_AboutUs(driver), txt);
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifyOurHistorySubMenu(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.submnu_OurHistory(driver), txt);
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifyOurGovernanceSubMenu(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.submnu_OurGovernance(driver), txt);
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifySustainabilitySubMenu(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.submnu_SustainabilityCSR(driver), txt);
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifyMolnlyckeInNumbersSubMenu(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.submnu_MolnlyckeInNumbers(driver), txt);
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifyGlobalCompanySubMenu(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.submnu_GlobalCompany(driver), txt);
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifyPartneringSubMenu(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.submnu_Partnering(driver), txt);
		return new ML_AboutUs_Logic();
	}

	public ML_AboutUs_Logic verifyBuildingClinicalSubMenu(String txt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_AboutUs_PageObjects.submnu_BuildingClinicalEvidence(driver), txt);
		return new ML_AboutUs_Logic();
	}
}
