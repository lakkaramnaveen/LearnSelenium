Feature: Sign in

Scenario: Test demowebshop login with valid credentails
Given User has navigated to login page
When User provides username and password
Then User signs in successfully

Scenario: Test demowebshop with invalid data
Given Application demowebshop is opened
When I provide valid username and invalid password
Then I should view an error message