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
@tag
Feature: About Us menu and its sub menu validation

  @tag2
  Scenario Outline: Verify sub menu of About Us menu
    Given Launch browser and open application
      | browser | application                |
      | FF      | https://www.molnlycke.com/ |
    When User mouse over the About Us menu
    Then About Us menu should expand verify heading "<heading1>"
    And Verify sub menu headings "<submenu1>", "<submenu2>","<submenu3>", "<submenu4>". "<submenu5>", "<submenu6>", "<submenu7>"
    And Close the browser

    Examples: 
      | heading1 | submenu1    | submenu2       | submenu3               | submenu4             | submenu5         | submenu6   | submenu7                   |
      | About us | Our History | Our governance | Sustainability and CSR | Mölnlycke in numbers | A global company | Partnering | Building clinical evidence |
