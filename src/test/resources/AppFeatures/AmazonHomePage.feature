Feature: Amazon Home  Page
        Inorder to test Amazon hom page application
        As a registered user
        I want to specify the feature of home page
        
Background:
      Given User is on Amazon Home Page

Scenario: Home page Top Panel Section
        
        Then user gets a Amazon search page
        And Username is also displayed next to the search filed
        And Amazon logo is also displayed
        And Cart link is also displayed
        
Scenario: Amazon Todays Deals  Section
        
        When user scroll down to Todays deal section
        Then user gets the list of multiple products
        And user get the product image and price details 
        And user can see more products by clicking on corousel
        
Scenario: Amazon Footer Links Section
        
        When User scroll down to footer of the page
        Then user gets all Country links
        |Australia|
        |Brazil|
        |China|
        And User gets all Amazon service links
            |Amazon Bussiness|
            |Amazon Webservices |
        And User gets all privacy policy links
            |Privacy note |
            |User & Sale |
            
        
