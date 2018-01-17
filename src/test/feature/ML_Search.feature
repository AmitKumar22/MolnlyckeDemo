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
Feature: Search functionality validation

  Scenario Outline: Verify the Search functionality
    Given Launch browser and open application
      | browser | application                |
      | FF      | https://www.molnlycke.com/ |
    When User click on Search Link
    Then Verify heading "<txtheading>" on search page
    When User enter "<searchText>"
    And Click on search buton
    Then Search page "<titlePage>" should be displayed
    And Verify searched text "<searchedText>"
    When Click on link "<searchedLink>"
    Then Page title should be "<titlePage1>"
    And Close the browser
    Examples: 
      | txtheading      | searchText    | titlePage           | searchedText  | searchedLink                                                                       | titlePage1                              | searchedText1 |
      | I'm looking for | Biogel gloves | Mölnlycke \| Search | Biogel gloves | https://www.molnlycke.com/products-and-solutions/surgical-solutions/biogel-gloves/ | Mölnlycke \| Biogel gloves \| Mölnlycke | Biogel gloves |
