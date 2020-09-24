$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Check Login",
  "description": "",
  "id": "check-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "check-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
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
  "duration": 8704168000,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 188750100,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3423563900,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_should_be_able_to_see_Logout_button()"
});
formatter.result({
  "duration": 1156633700,
  "status": "passed"
});
});