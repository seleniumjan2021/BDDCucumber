$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "UI Cogmento Login Feature",
  "description": "",
  "id": "ui-cogmento-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4155621891,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User Logout Scenario",
  "description": "",
  "id": "ui-cogmento-login-feature;user-logout-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Sanity"
    },
    {
      "line": 22,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is already on LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Title of the Page is CogmentoCRM",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user enters the \"aakash.er@gmail.com\" and \"lucknow_1000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "clicks on Submit loginButton",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "verify user is on HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "logout from the application",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.user_is_already_on_LoginPage()"
});
formatter.result({
  "duration": 10800926882,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.title_of_the_page_is_CogmentoCRM()"
});
formatter.result({
  "duration": 18513383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aakash.er@gmail.com",
      "offset": 17
    },
    {
      "val": "lucknow_1000",
      "offset": 43
    }
  ],
  "location": "stepDefinitions.user_enters_the_username_and_password(String,String)"
});
formatter.result({
  "duration": 4560083664,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.clicks_on_submit_loginButton()"
});
formatter.result({
  "duration": 2105849746,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.verify_user_is_on_HomePage()"
});
formatter.result({
  "duration": 4041733727,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.logout_from_the_application()"
});
formatter.result({
  "duration": 11265290796,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.close_the_browser()"
});
formatter.result({
  "duration": 174078666,
  "status": "passed"
});
formatter.after({
  "duration": 30056,
  "status": "passed"
});
});