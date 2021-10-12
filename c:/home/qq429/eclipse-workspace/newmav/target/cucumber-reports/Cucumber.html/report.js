$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "Login cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Student should enter valid \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Student should select next Button",
  "keyword": "And "
});
formatter.step({
  "name": "Student should verify success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username"
      ]
    },
    {
      "cells": [
        "admin@admin.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.studentIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should enter valid \"admin@admin.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.studentShouldEnterValid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should select next Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.studentShouldSelectnextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentShouldVerifySuccessMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Check next button is enabled or not",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags2"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Student should not enter any mail id \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Student should check next button is enabled",
  "keyword": "And "
});
formatter.step({
  "name": "Student should verify its enabled or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username"
      ]
    },
    {
      "cells": [
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check next button is enabled or not",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags2"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.studentIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should not enter any mail id \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.studentShouldNotEnterAnyMailId(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should check next button is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.studentShouldCheckNextButtonIsEnabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should verify its enabled or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentShouldVerifyItsEnabledOrNot()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags3"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Student should enter invalid \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Student should verify get accept message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username"
      ]
    },
    {
      "cells": [
        "file123@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags3"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.studentIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should enter invalid \"file123@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.studentShouldEnterInvalid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should verify get accept message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentShouldVerifyGetAcceptMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags4"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Student should enter the valid email\"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Student should select the next Button",
  "keyword": "And "
});
formatter.step({
  "name": "Student should enter the valid password \"\u003cpasskey\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Should should verify passkey successfully entered",
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
        "passkey"
      ]
    },
    {
      "cells": [
        "admin@admin.com",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags4"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.studentIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should enter the valid email\"admin@admin.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.studentShouldEnterTheValidEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should select the next Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.studentShouldSelectTheNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should enter the valid password \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentShouldEnterTheValidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should should verify passkey successfully entered",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.shouldShouldVerifyPasskeySuccessfullyEntered()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "New password with uppercase letter",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags5"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Student should enter  valid email\"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Student should select  next Button",
  "keyword": "And "
});
formatter.step({
  "name": "Student should enter  valid  uppercase password \"\u003cpasskey\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Should should verify uppercase passkey successfully entered",
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
        "passkey"
      ]
    },
    {
      "cells": [
        "admin@admin.com",
        "ADMIN"
      ]
    }
  ]
});
formatter.scenario({
  "name": "New password with uppercase letter",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags5"
    }
  ]
});
formatter.step({
  "name": "Student is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.studentIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should enter  valid email\"admin@admin.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.studentShouldEnterValidEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should select  next Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.studentShouldSelectNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should enter  valid  uppercase password \"ADMIN\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.studentShouldEnterValidUppercasePassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should should verify uppercase passkey successfully entered",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.shouldShouldVerifyUppercasePasskeySuccessfullyEntered()"
});
formatter.result({
  "status": "passed"
});
});