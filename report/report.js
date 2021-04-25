$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/APITest.feature");
formatter.feature({
  "name": "Test API status and total number of currencies",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate HTTP status and response",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open the endpoint url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.APITest.openurl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate HTTP status code",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.APITest.validatestatus()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get and validate currency",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.APITest.validatecurrency()"
});
formatter.result({
  "status": "passed"
});
});