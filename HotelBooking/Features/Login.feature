Feature: Check Login of hotel

Scenario: Successful login with valid credentials of hotel 
Given User in on login page of hotel
When User enters valid user name and password of hotel
And User clicks on login button of hotel
Then User should be able to see Hotel booking form

@invalid
Scenario: Successful booking of room in a hotel
Given User in on hotel booking form page 
When User enters personal details
And User enters payment details
And User clicks on confirm booking
Then User should be able to see Booking Completed