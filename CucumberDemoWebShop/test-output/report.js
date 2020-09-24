$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Check Login",
  "description": "",
  "id": "check-login",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#@smoke"
    }
  ],
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "check-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User in on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to see Logout button.",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckLogin.user_in_on_login_page()"
});
formatter.result({
  "duration": 8746486500,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 186173700,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3256386400,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_should_be_able_to_see_Logout_button()"
});
formatter.result({
  "duration": 1250728600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#@regression"
    }
  ],
  "line": 10,
  "name": "UnSuccessful login with valid credentials",
  "description": "",
  "id": "check-login;unsuccessful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User has opened login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enters valid username and invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicked on login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should be able to see \"Login was unsuccessfull\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidLogin.user_has_opened_login_page()"
});
formatter.result({
  "duration": 7902692500,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogin.user_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "duration": 205183100,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogin.user_clicked_on_login_button()"
});
formatter.result({
  "duration": 605124700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessfull",
      "offset": 28
    }
  ],
  "location": "InvalidLogin.user_should_be_able_to_see(String)"
});
formatter.result({
  "duration": 177300500,
  "status": "passed"
});
formatter.uri("datatable.feature");
formatter.feature({
  "line": 1,
  "name": "Login with datatable",
  "description": "",
  "id": "login-with-datatable",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valid entries",
  "description": "",
  "id": "login-with-datatable;successful-login-with-valid-entries",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user in on demowebshoptricentis.com page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user signs in with valid email and valid password",
  "rows": [
    {
      "cells": [
        "naveen1234@gmail.com",
        "123456"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should see logout",
  "keyword": "Then "
});
formatter.match({
  "location": "DTdemo.user_in_on_demowebshoptricentis_com_page()"
});
formatter.result({
  "duration": 7618930100,
  "status": "passed"
});
formatter.match({
  "location": "DTdemo.user_signs_in_with_valid_email_and_valid_password(DataTable)"
});
formatter.result({
  "duration": 177901200,
  "status": "passed"
});
formatter.match({
  "location": "DTdemo.user_should_see_logout()"
});
formatter.result({
  "duration": 2637558300,
  "status": "passed"
});
});