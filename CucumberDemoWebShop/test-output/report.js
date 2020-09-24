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
  "duration": 8590550300,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 193334000,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2351320000,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_should_be_able_to_see_Logout_button()"
});
formatter.result({
  "duration": 999466700,
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
  "duration": 7630916300,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogin.user_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "duration": 167414900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogin.user_clicked_on_login_button()"
});
formatter.result({
  "duration": 664162400,
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
  "duration": 185753100,
  "status": "passed"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "user registration for demowebshop",
  "description": "",
  "id": "user-registration-for-demowebshop",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Registration of user with valid data",
  "description": "",
  "id": "user-registration-for-demowebshop;successful-registration-of-user-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on register page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters valid personal details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters valid password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should see a message registration successful with continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterUser.user_is_on_register_page()"
});
formatter.result({
  "duration": 7539778100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUser.user_enters_valid_personal_details()"
});
formatter.result({
  "duration": 329341400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUser.user_enters_valid_password()"
});
formatter.result({
  "duration": 154390200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUser.user_clicks_on_rgister_button()"
});
formatter.result({
  "duration": 1162178800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUser.i_should_see_registration_succesful_with_continue_button()"
});
formatter.result({
  "duration": 2132787700,
  "status": "passed"
});
formatter.uri("RegisterOutline.feature");
formatter.feature({
  "line": 1,
  "name": "user registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registration of user with valid data",
  "description": "",
  "id": "user-registration;registration-of-user-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on register page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters valid personal details like \u003cgender\u003e and \u003cfirstName\u003e and \u003clastName\u003e and \u003cemail\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user gives valid \u003cpassword\u003e and \u003cconfirmPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should see a message registration successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-registration;registration-of-user-with-valid-data;",
  "rows": [
    {
      "cells": [
        "gender",
        "firstName",
        "lastName",
        "email",
        "password",
        "confirmPassword"
      ],
      "line": 11,
      "id": "user-registration;registration-of-user-with-valid-data;;1"
    },
    {
      "cells": [
        "Male",
        "rahul",
        "kumar",
        "rahulanna5@gmail.com",
        "123456",
        "123456"
      ],
      "line": 12,
      "id": "user-registration;registration-of-user-with-valid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Registration of user with valid data",
  "description": "",
  "id": "user-registration;registration-of-user-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on register page of website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters valid personal details like Male and rahul and kumar and rahulanna5@gmail.com",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user gives valid 123456 and 123456",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should see a message registration successful",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterUserOutline.user_is_on_register_page()"
});
formatter.result({
  "duration": 7617735000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 40
    },
    {
      "val": "rahul",
      "offset": 49
    },
    {
      "val": "kumar",
      "offset": 59
    },
    {
      "val": "rahulanna5@gmail.com",
      "offset": 69
    }
  ],
  "location": "RegisterUserOutline.user_enters_valid_personal_details_like_Male_rahul_kumar_rahulanna_gmail_com(String,String,String,String)"
});
formatter.result({
  "duration": 335004600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 17
    },
    {
      "val": "123456",
      "offset": 28
    }
  ],
  "location": "RegisterUserOutline.user_enters_valid(String,String)"
});
formatter.result({
  "duration": 159511200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserOutline.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 1125130600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterUserOutline.user_should_see_a_message_registration_successful_with_continue_button()"
});
formatter.result({
  "duration": 2126293400,
  "status": "passed"
});
formatter.uri("bgdemo.feature");
formatter.feature({
  "line": 1,
  "name": "check title",
  "description": "",
  "id": "check-title",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "This is a demo",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the homepage of demoweb",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDemo.i_am_on_the_homepage_of_demoweb()"
});
formatter.result({
  "duration": 7452491900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Check the title of demowebshop.tricentis",
  "description": "",
  "id": "check-title;check-the-title-of-demowebshop.tricentis",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I should see that title contains demowebshop",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundDemo.i_should_see_that_title_contains_demowebshop()"
});
formatter.result({
  "duration": 69812700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "This is a demo",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the homepage of demoweb",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDemo.i_am_on_the_homepage_of_demoweb()"
});
formatter.result({
  "duration": 7513079000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Check the source of demowbshop.tricentis",
  "description": "",
  "id": "check-title;check-the-source-of-demowbshop.tricentis",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I should see that source contains demowebshop",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundDemo.i_should_see_that_source_contains_demowebshop()"
});
formatter.result({
  "duration": 85947100,
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
  "duration": 7474797800,
  "status": "passed"
});
formatter.match({
  "location": "DTdemo.user_signs_in_with_valid_email_and_valid_password(DataTable)"
});
formatter.result({
  "duration": 196311700,
  "status": "passed"
});
formatter.match({
  "location": "DTdemo.user_should_see_logout()"
});
formatter.result({
  "duration": 2561404800,
  "status": "passed"
});
formatter.uri("scenariooutlinedemo.feature");
formatter.feature({
  "line": 1,
  "name": "demo scenario outline for login",
  "description": "",
  "id": "demo-scenario-outline-for-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful login with valid data",
  "description": "",
  "id": "demo-scenario-outline-for-login;successful-login-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I provide valid \u003cemail\u003e and valid \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see logout link",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "demo-scenario-outline-for-login;successful-login-with-valid-data;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9,
      "id": "demo-scenario-outline-for-login;successful-login-with-valid-data;;1"
    },
    {
      "cells": [
        "naveen1234@gmail.com",
        "123456"
      ],
      "line": 10,
      "id": "demo-scenario-outline-for-login;successful-login-with-valid-data;;2"
    },
    {
      "cells": [
        "rahulanna@gmail.com",
        "123456"
      ],
      "line": 11,
      "id": "demo-scenario-outline-for-login;successful-login-with-valid-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Successful login with valid data",
  "description": "",
  "id": "demo-scenario-outline-for-login;successful-login-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I provide valid naveen1234@gmail.com and valid 123456",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "OutlineDemo.application_is_opened()"
});
formatter.result({
  "duration": 7276234000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveen1234@gmail.com",
      "offset": 16
    },
    {
      "val": "123456",
      "offset": 47
    }
  ],
  "location": "OutlineDemo.i_provide_valid_naveen_gmail_com_and_valid(String,String)"
});
formatter.result({
  "duration": 184220100,
  "status": "passed"
});
formatter.match({
  "location": "OutlineDemo.i_should_see_logout_link()"
});
formatter.result({
  "duration": 3697066400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful login with valid data",
  "description": "",
  "id": "demo-scenario-outline-for-login;successful-login-with-valid-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I provide valid rahulanna@gmail.com and valid 123456",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "OutlineDemo.application_is_opened()"
});
formatter.result({
  "duration": 7759879300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rahulanna@gmail.com",
      "offset": 16
    },
    {
      "val": "123456",
      "offset": 46
    }
  ],
  "location": "OutlineDemo.i_provide_valid_naveen_gmail_com_and_valid(String,String)"
});
formatter.result({
  "duration": 194183400,
  "status": "passed"
});
formatter.match({
  "location": "OutlineDemo.i_should_see_logout_link()"
});
formatter.result({
  "duration": 4424503700,
  "status": "passed"
});
});