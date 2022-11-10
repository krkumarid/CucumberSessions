Feature:Home Page
        Inodrder to check my order details
        As a registred user
        I want to speify  the features of order details page

Background:
          Given a registered user exists
          Given  user is on Amazon login page
          When user enters the name
          And user enters the password
          And user clicks  on login button
          Then user navigates to the order page
Scenario: check previous order Details
         When user clicks on order link
         Then user checks the previous order details
Scenario: check the open order details
         When user clicks on open order link
         Then user checks  the open order details
Scenario: Check the cancelled order details
         When user clicks on cancelled order link
         Then user checks the  cancelled order details