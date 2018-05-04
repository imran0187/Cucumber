$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "user registration feature",
  "description": "",
  "id": "user-registration-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "duration": 4206590483,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user is able to register an account",
  "description": "",
  "id": "user-registration-feature;verify-user-is-able-to-register-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on registration button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify registration page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter all valid information on registration",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify registration successful message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 2414321612,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.i_click_on_registration_button()"
});
formatter.result({
  "duration": 1243101177,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.i_verify_registration_page_is_displayed()"
});
formatter.result({
  "duration": 42714113,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.i_enter_all_valid_information_on_registration()"
});
formatter.result({
  "duration": 17631914170,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.i_verify_registration_successful_message_is_displayed()"
});
formatter.result({
  "duration": 5027413960,
  "status": "passed"
});
formatter.after({
  "duration": 608123643,
  "status": "passed"
});
});