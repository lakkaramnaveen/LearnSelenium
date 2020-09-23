Feature: Check Login

Scenario: Successful login with valid credentials
Given User in on login page
When User enters valid username and password
And User clicks on login button
Then User should be able to see Logout button.