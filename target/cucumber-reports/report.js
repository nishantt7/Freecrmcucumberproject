$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free crm login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free crm user login test",
  "description": "",
  "id": "free-crm-login-feature;free-crm-user-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When title of login page is freecrm"
    }
  ],
  "line": 7,
  "name": "user enters username \"pranshoomalhotra@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters password \"Freecrm@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefinition.user_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "pranshoomalhotra@gmail.com",
      "offset": 22
    }
  ],
  "location": "Loginstepdefinition.user_enters_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Freecrm@123",
      "offset": 22
    }
  ],
  "location": "Loginstepdefinition.user_enters_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Loginstepdefinition.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
});