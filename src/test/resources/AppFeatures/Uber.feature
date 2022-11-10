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
@Uber
Feature: Uber Booking feature

@Smoke @qa-ready @US-1001 @Epic-900
  Scenario: Booking  Cab Sedan
    Given User wants to select a car type "sedan" from uber application 
    When User select car "sedan" and pick up point "Banglore" and drop location "Pune"
    Then Driver stars the journey
    And cDriver Ends the journey
   Then user pays 1000 USD
   Then User Checks the trip details
@Regression
  Scenario: Booking  Cab SUV
    Given User wants to select a car type "SUV" from uber application 
    When User select car "SUV" and pick up point "Banglore" and drop location "Cochin"
    Then Driver stars the journey
    And cDriver Ends the journey
   Then user pays 1500 USD
   
   @Production
  Scenario: Booking  Cab Van
    Given User wants to select a car type "Van" from uber application 
    When User select car "Van" and pick up point "Banglore" and drop location "Hyderabad"
    Then Driver stars the journey
    And cDriver Ends the journey
   Then user pays 2000 USD