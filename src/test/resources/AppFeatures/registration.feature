Feature: User Registration

Scenario: User Registration with different data

Given user is on registration page
When user enters following user details
| Rajeev|Kumar | kumar@gmail.com | 8069773015 | Apex|
| Kasi|Rajeev | kasi@gmail.com | 7034345082 | Cary|
| Karthi|Rajeev | karthi@gmail.com | 9194981515 | Durham|
Then user registration should be successful

Scenario: User Registration with different data with column names

Given user is on registration page
When user enters following user details with column
|FirstName|LastName|Email|Phone|City|
| Asha|Unni | kumar@gmail.com | 8069773015 | Apex|
| Smitha|Das | kasi@gmail.com | 7034345082 | Cary|
| Karthi|Rajeev | karthi@gmail.com | 9194981515 | Durham|
Then user registration should be successful
