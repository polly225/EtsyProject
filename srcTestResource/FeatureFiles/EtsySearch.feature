@EtsyProject @regression
Feature: As a user, I want to search for a specific item

Scenario: Search for iphone case on search tab

Given User browse to etsy web application
When User types in iphone case on search tab
And User clicks on search button on the right hand side
Then Verify all types of iphone cases appears on page.
