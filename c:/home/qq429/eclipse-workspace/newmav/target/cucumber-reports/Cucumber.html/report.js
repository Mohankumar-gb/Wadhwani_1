$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Student.feature");
formatter.feature({
  "name": "Automating Student Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Student should click on save and continue",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag8"
    }
  ]
});
formatter.step({
  "name": "Student ShouldBe in COURSEPAGe",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.studentShouldBeInCOURSEPAGe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should should see save and continue",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.shouldShouldSeeSaveAndContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should should click on save and continue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.shouldShouldClickOnSaveAndContinue()"
});
formatter.result({
  "status": "passed"
});
});