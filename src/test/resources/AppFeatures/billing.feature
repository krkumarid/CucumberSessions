Feature:Calculate billing amount
Scenario Outline: Billing amount

Given User is on billing page
When User enters billing amount "<BillingAmount>"
When User enters tax amount "<TaxAmount>" 
And User clicks on calculate button
Then It gives the final amount "<FinalAmount>"

Examples:
        | BillingAmount|TaxAmount|FinalAmount |
        | 1000         | 10      | 1010       |
        | 500          | 20      | 520        |
        | 100          | 5.5     |  105.5     |