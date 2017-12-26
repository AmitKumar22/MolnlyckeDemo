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
Feature: Validate Select Market > Norwegian main page

  @tag2
  Scenario Outline: Verify Norwegian main page headings
    Given Launch browser and open application
      | browser | application                |
      | FF      | https://www.molnlycke.com/ |
    When User Click on Select Market link and click on Norway link
    Then Norwegian "<language>" Molnlycke main page should be displayed with "<pageTitle>"
    And Norwegian headings should be "<norheading1>","<norheading2>","<norheading3>","<norheading4>","<norheading5>","<norheading6>","<norheading7>" on the top of the page.
    And Close the browser

    Examples: 
      | pageTitle                                                                                                        | language | norheading1    | norheading2          | norheading3 | norheading4  | norheading5      | norheading6 | norheading7      |
      | Løsninger for sikre, effektive kirurgiske prosedyrer og skånsom, effektiv sårbehandling \| Mölnlycke Health Care | Norway   | Våre løsninger | Produkter og service | Kunnskap    | Undervisning | Nyheter og media | Om oss      | For privatkunder |
