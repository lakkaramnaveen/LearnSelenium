Feature: check title

Background: This is a demo
Given I am on the homepage of demoweb

Scenario: Check the title of demowebshop.tricentis
Then I should see that title contains demowebshop

Scenario: Check the source of demowbshop.tricentis
Then I should see that source contains demowebshop