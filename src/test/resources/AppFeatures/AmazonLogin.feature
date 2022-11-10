Feature: Amazon Login Page
        In order to  test login page
        As a registered  user
        I want to specify the login condition
#Scenario: Amazon Login Page
        #Given user is on Amazon landing page
        #Given Sign in button is present on the screen
        #When user clicks on sign in button
        #Then user can see the login screen
        #When user enters "naveen@gmail.com" in username field
        #When user enters "test123" in password field
        #When user clicks sign in button
        #Then user is in then home page
        #Then title of the page is "Amazn"
        #
        # In the above scenarion the steps are repeating ans its not a good practrice 
        # to repaeat the same keyword. So Gherkin has two keywords AND ,BUT .
        # The abvove scenario can be rewrite as below
        
        Scenario: Amazon Login Page
        Given user is on Amazon landing page
        And Sign in button is present on the screen
        When user clicks on sign in button
        Then user can see the login screen
        When user enters "naveen@gmail.com" in username field
        And user enters "test123" in password field
        And user clicks sign in button
        Then user is in then home page
        And title of the page is "Amazon"
        But Sign in button is not present
        