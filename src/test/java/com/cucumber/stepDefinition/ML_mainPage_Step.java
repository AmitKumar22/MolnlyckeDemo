package com.cucumber.stepDefinition;

import java.util.List;
import com.cucumber.businessLogic.ML_MainPage_Logic;
import com.cucumber.utilityCommon.CommonMethods;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ML_mainPage_Step {
	ML_MainPage_Logic mainPage;

	@Given("^Launch browser and open application$")
	public void launch_browser_and_open_application(DataTable arg1) throws Exception {
		mainPage = new ML_MainPage_Logic();
		List<List<String>> data = arg1.raw();
		System.out.println(data.get(1).get(0) + "xxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(data.get(1).get(1) + "xxxxxxxxxxxxxxxxxxxxxxxxxxx");
		CommonMethods.launchBrowser(data.get(1).get(0), data.get(1).get(1));
		mainPage.clickIagree();
	}

	@When("^User verify the main page title, logoLink, headings, mainMenu$")
	public void user_verify_the_main_page_title_logoLink_headings_mainMenu() throws Exception {

	}

	@Then("^Main page title should be \"([^\"]*)\"$")
	public void main_page_title_should_be(String titletxt) throws Exception {
		CommonMethods.verifyPageTitle(titletxt);
	}

	@And("^Logo link should be \"([^\"]*)\"$")
	public void logo_link_should_be(String logoSrc) throws Exception {
		mainPage.verifyLogoSource(logoSrc);
	}

	@And("^Top pane should contains headings \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void top_pane_should_contains_headings(String heading1, String heading2, String heading3) throws Exception {
		mainPage.verifySelectMarketHeading(heading1);
		mainPage.verifyContactUsHeading(heading2);
		mainPage.verifySearchHeading(heading3);
	}

	@And("^The main menu items should be \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void the_main_menu_items_should_be(String menu1, String menu2, String menu3, String menu4) throws Exception {
		mainPage.verifyAboutUsMenu(menu1);
		mainPage.verifyProductAndSolutionMenu(menu2);
		mainPage.verifyCareerMenu(menu3);
		mainPage.verifyNewsMenu(menu4);
	}
	
	@And("^Close the browser$")
	public void Close_the_browser() throws Exception {
		CommonMethods.closeBrowser();
	}
	
}
