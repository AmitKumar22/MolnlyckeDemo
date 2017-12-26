package com.cucumber.businessLogic;

import com.cucumber.pageObjects.ML_SelectMkt_Norway_PageObject;
import com.cucumber.utilityCommon.CommonMethods;

public class ML_SelectMkt_Norway_Logic extends CommonMethods {

	public ML_SelectMkt_Norway_PageObject clickSelectMarketHeading() {
		CommonMethods.waitForMilliSeconds("2");
		ML_SelectMkt_Norway_PageObject.hdg_SelectMarket(driver).click();
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject clickNorwayLink() {
		CommonMethods.waitForMilliSeconds("2");
		ML_SelectMkt_Norway_PageObject.lnk_Norway(driver).click();
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyNorwayText(String lang) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.txt_Norway(driver), lang);
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyVåreLøsningerLink(String heading1) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.lnk_VåreLøsninger(driver), heading1);
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyProdukterServiceLink(String heading2) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.lnk_ProdukterOgService(driver), heading2);
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyKunnskapLink(String heading3) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.lnk_Kunnskap(driver), heading3);
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyUndervisningLink(String heading4) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.lnk_Undervisning(driver), heading4);
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyNyheterMediaLink(String heading5) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.lnk_NyheterOgMedia(driver), heading5);
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyOmOssLink(String heading6) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.lnk_OmOss(driver), heading6);
		return new ML_SelectMkt_Norway_PageObject();
	}

	public ML_SelectMkt_Norway_PageObject verifyForPrivatkunderLink(String heading7) {
		CommonMethods.waitForMilliSeconds("2");
		CommonMethods.verifyText(ML_SelectMkt_Norway_PageObject.lnk_ForPrivatkunder(driver), heading7);
		return new ML_SelectMkt_Norway_PageObject();
	}

}
