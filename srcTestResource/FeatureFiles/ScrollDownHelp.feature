@EtsyProject @regression
Feature: As a user I want navigate to Help Center Page.

Scenario: Scroll down to bottom of Homepage and navigate to HelpCenter Page



Given User browse to etsy web application
When User scrolls down to bottom of homepage
And User navigates to Help Center
Then Verify Help Center page appears.
