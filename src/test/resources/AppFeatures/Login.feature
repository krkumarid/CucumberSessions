Feature:Login Failure
  Scenario Outline: Login fail - possible combinations
    Given User is on Application landing page
    When user clicks on Sign in Button
    Then user is diplayed the login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user Clicks Sign in button
    Then user gets loging failed error messge

    Examples: 
      | UserName  | Password | 
      | incorrectusername | 123456 |
      | naveenautomation | incorrectpassword |
      | naveenautomation | incorrectpassword|
