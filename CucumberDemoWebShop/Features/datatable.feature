Feature: Login with datatable

Scenario: Successful login with valid entries
Given user in on demowebshoptricentis.com page
When user signs in with valid email and valid password
|naveen1234@gmail.com|123456|
Then user should see logout