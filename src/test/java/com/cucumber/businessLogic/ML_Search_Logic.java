package com.cucumber.businessLogic;

import com.cucumber.pageObjects.ML_Search_PageObjects;
import com.cucumber.utilityCommon.CommonMethods;

public class ML_Search_Logic extends CommonMethods {
	
	public ML_Search_Logic clickSearchLink() {
		CommonMethods.waitForMilliSeconds("2");
		ML_Search_PageObjects.hdg_Search(driver).click();
		return new ML_Search_Logic();
	}

	public ML_Search_Logic verifyImLookingForHeading(String txtheading) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_Search_PageObjects.lbl_ImLookingFor(driver), txtheading);
		return new ML_Search_Logic();
	}
	
	public ML_Search_Logic enterSearchText(String searchtxt) {
		CommonMethods.waitForMilliSeconds("2");
		ML_Search_PageObjects.txtBox_Search(driver).sendKeys(searchtxt);
		return new ML_Search_Logic();
	}
	
	public ML_Search_Logic clickSendButton() {
		CommonMethods.waitForMilliSeconds("2");
		ML_Search_PageObjects.btn_Search(driver).click();
		return new ML_Search_Logic();
	}
	
	public ML_Search_Logic verifySearchPageTitle(String pageTitle) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyPageTitle(pageTitle);
		return new ML_Search_Logic();
	}
	
	public ML_Search_Logic verifySearchedText(String searchTxt) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyTxtContains(ML_Search_PageObjects.txt_SearchResultContainer(driver).getText(), searchTxt);
		return new ML_Search_Logic();
	}
	
	public ML_Search_Logic clickOnLink_BiogelGloves() {
		CommonMethods.waitForMilliSeconds("2");
		ML_Search_PageObjects.lnk_BiogelGloves(driver).click();
		return new ML_Search_Logic();
	}
}
