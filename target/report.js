$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ADMIN/eclipse-workspace/Cucumber_New/src/test/resources/First/firstcucumber.feature");
formatter.feature({
  "name": "check the facebook login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login facebook",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "load the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.load_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username and password in facebook page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.enter_username_and_password_in_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User succesfully login the facebook page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_succesfully_login_the_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});