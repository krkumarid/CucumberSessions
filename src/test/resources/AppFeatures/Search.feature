

Feature: Amazon Search
@Smoke
Scenario: Search a Product MacBoor Air
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBookAir" and price 2500
Then Product with name "Apple MacBookAir" should be displayed
Then Order id is 12345 and username is "Rajeevkumar"

@Regression
Scenario: Search a Product iPhone 12
Given I have a search field on Amazon Page
When I search for a product with name "Iphone 12" and price 1200
Then Product with name "Iphone 12" should be displayed
Then Order id is 707360 and username is "Sreesha"

