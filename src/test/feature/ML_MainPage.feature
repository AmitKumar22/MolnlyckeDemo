#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Verify http://monlycke.com main page

  Scenario Outline: Verify headings and title of http://monlycke.com main page
    Given Launch browser and open application
      | browser | application                |
      | FF      | https://www.molnlycke.com/ |
    When User verify the main page title, logoLink, headings, mainMenu
    Then Main page title should be "<title>"
    And Logo link should be "<logoLink>"
    And Top pane should contains headings "<heading1>", "<heading2>", "<heading3>"
    And The main menu items should be "<mainMenu1>", "<mainMenu2>", "<mainMenu3>", "<mainMenu4>"
    And Close the browser

    Examples: 
      | title                             | logoLink                    | heading1      | heading2   | heading3 | mainMenu1 | mainMenu2              | mainMenu3 | mainMenu4 |
      | Mölnlycke \| Proving it every day | logo-molnlycke-master-green | SELECT MARKET | CONTACT US | SEARCH   | ABOUT US  | PRODUCTS AND SOLUTIONS | CAREERS   | NEWS      |
