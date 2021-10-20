$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "Login cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Join button is click or not with entering batchid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags36"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise staging Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Student should enter an valid email\"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Student click the next Button",
  "keyword": "And "
});
formatter.step({
  "name": "student enter the password\"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Student click the signin Button",
  "keyword": "Then "
});
formatter.step({
  "name": "Student click the  course Button",
  "keyword": "Then "
});
formatter.step({
  "name": "Student enter the batch id\"\u003cid\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Student click an join Button",
  "keyword": "Then "
});
formatter.step({
  "name": "Student should verify its join button  click ornot",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "id"
      ]
    },
    {
      "cells": [
        "samya@gmail.com",
        "pass",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Join button is click or not with entering batchid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags36"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise staging Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.studentIsOnTheLearnwiseStagingLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should enter an valid email\"samya@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.studentShouldEnterAnValidEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student click the next Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.studentClickTheNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "student enter the password\"pass\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentEnterThePassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student click the signin Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentClickTheSigninButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student click the  course Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentClickTheCourseButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student enter the batch id\"1234\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentEnterTheBatchId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student click an join Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentClickAnJoinButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should verify its join button  click ornot",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentShouldVerifyItsJoinButtonClickOrnot()"
});
formatter.result({
  "status": "passed"
});
});