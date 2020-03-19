@EtsyProject @regression
Feature: As a user I want to see iphone cases which come with free shipping and under 25 dollars.

Scenario: Select free shipping and under 25.00 dollars box for iphone cases items.

Given User is already on iphone case items page
When User selects free shipping box on right hand side.
And User selects items under twenty five box on right hand side.
Then User should see all iphone cases with free shipping and under twenty five dollars appear on page.
