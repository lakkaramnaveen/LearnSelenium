Feature: user registration for demowebshop

Scenario: Successful Registration of user with valid data
Given user is on register page
When user enters valid personal details
And user enters valid password 
And user clicks on register button
Then user should see a message registration successful with continue button
