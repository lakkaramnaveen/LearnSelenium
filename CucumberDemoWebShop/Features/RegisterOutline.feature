Feature: user registration 

Scenario Outline: Registration of user with valid data
Given user is on register page of website
When user enters valid personal details like <gender> and <firstName> and <lastName> and <email> 
And user gives valid <password> and <confirmPassword>
And user click on register button
Then user should see a message registration successful

Examples:
|gender	|firstName	|lastName	|email					|password |confirmPassword|
|Male	|rahul		|kumar		|rahulanna5@gmail.com	|123456	  |123456		  |


