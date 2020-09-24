Feature: demo scenario outline for login

Scenario Outline: Successful login with valid data
Given Application is opened
When I provide valid <email> and valid <password> 
Then I should see logout link

Examples:
|email				 	|password	|
|naveen1234@gmail.com	|123456 	|
|rahulanna@gmail.com	|123456 	|