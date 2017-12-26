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
Feature: Contact Us Form validation

  Scenario Outline: Verify Contact Us form
    Given Launch browser and open application
      | browser | application                |
      | FF      | https://www.molnlycke.com/ |
    When User click on Contact Us Link
    Then Contact Us form should be displayed.
    And Verify "<txtheading>" heading
    When User enter "<country>", "<email>", "<message>","<captcha>"
    And Select consent
    And User click send button
    Then Verify the error message "<erroMsg>" should be displayed under Catpcha
    And Close the browser

    Examples: 
      | country | email                   | message                 | captcha | erroMsg                                      | txtheading        |
      | India   | AutomationTest@test.com | Automation test message | ABC12   | Enter the characters you see in the picture. | Contact Mölnlycke |
