$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/KARTHIK OOPRAPPAN/eclipse-workspace/CucumberTest/Features/Login.feature");
formatter.feature({
  "name": "Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "BrowserLaunch",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.browserlaunch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open the URL \"https://admin-demo.nopcommerce.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Definition.open_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username \"admin@yourstore.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Definition.enter_Username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "Definition.enter_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition.click()"
});
formatter.result({
  "status": "passed"
});
});