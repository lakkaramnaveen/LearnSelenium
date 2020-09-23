Feature: Check Login

Scenario: Successful login with valid credentials
Given User in on login page
When User enters valid username and password
And User clicks on login button
Then User should be able to see Logout button.

Scenario: UnSuccessful login with valid credentials
Given User has opened login page
When User enters valid username and invalid password
And User clicked on login button
Then User should be able to see "Login was unsuccessfull"