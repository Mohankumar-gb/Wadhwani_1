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
  "error_message": "org.openqa.selenium.WebDriverException: TypeError: browsingContext.currentWindowGlobal is null\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027rutisqq430\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.11.0-37-generic\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 93.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210927210923, moz:geckodriverVersion: 0.30.0, moz:headless: false, moz:processID: 18174, moz:profile: /tmp/rust_mozprofilecqqhBw, moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, platformVersion: 5.11.0-37-generic, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ce6c06fa-667e-4e66-9bea-7c61bdd00043\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027password\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat POM.LoginPom.passKey(LoginPom.java:19)\n\tat com.stepDefinition.StepDefinition1.studentShouldEnterTheValidPassword(StepDefinition1.java:109)\n\tat ✽.Student should enter the valid password \"admin\"(src/test/resources/login.feature:40)\n",
  "status": "failed"
});
formatter.step({
  "name": "Should should verify passkey successfully entered",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.shouldShouldVerifyPasskeySuccessfullyEntered()"
});
formatter.result({
  "status": "skipped"
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
  "error_message": "org.openqa.selenium.WebDriverException: TypeError: browsingContext.currentWindowGlobal is null\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027rutisqq430\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.11.0-37-generic\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 93.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20210927210923, moz:geckodriverVersion: 0.30.0, moz:headless: false, moz:processID: 18439, moz:profile: /tmp/rust_mozprofileCYwKlT, moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, platformVersion: 5.11.0-37-generic, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 61005176-7f20-4e89-b9d0-16cb92fa3b5f\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027password\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat POM.LoginPom.passKey(LoginPom.java:19)\n\tat com.stepDefinition.StepDefinition1.studentShouldEnterValidUppercasePassword(StepDefinition1.java:137)\n\tat ✽.Student should enter  valid  uppercase password \"ADMIN\"(src/test/resources/login.feature:52)\n",
  "status": "failed"
});
formatter.step({
  "name": "Should should verify uppercase passkey successfully entered",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.shouldShouldVerifyUppercasePasskeySuccessfullyEntered()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Joining courses",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tags6"
    }
  ]
});
formatter.step({
  "name": "User should be in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.userShouldBeInHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on course",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userShouldClickOnCourse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should start the course",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userShouldStartTheCourse()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Click on create Batch",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag7"
    }
  ]
});
formatter.step({
  "name": "User should be in couRse",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.userShouldBeInCouRse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on courses",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userShouldClickOnCourses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should able to Create A Batch",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userShouldAbleToCreateABatch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Entering Batch Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag8"
    }
  ]
});
formatter.step({
  "name": "Be in course page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.beInCoursePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on create batch",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.clickOnCreateBatch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter details to create batch",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.enterDetailsToCreateBatch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Copy Batch Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag9"
    }
  ]
});
formatter.step({
  "name": "User should be in home page on course",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.userShouldBeInHomePageOnCourse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Create BATCH",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userShouldClickCreateBATCH()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on copy batch",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.clickOnCopyBatch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Enter copy batch details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag10"
    }
  ]
});
formatter.step({
  "name": "User should be in course page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.userShouldBeInCoursePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Copy BATCH",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userShouldClickCopyBATCH()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Batch deTails",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.enterBatchDeTails()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Clicking on Start Course",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag11"
    }
  ]
});
formatter.step({
  "name": "User should be in coursepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.userShouldBeInCoursepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on Start course",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userShouldClickOnStartCourse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see coursedetails",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userShouldSeeCoursedetails()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Changing Batch",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag12"
    }
  ]
});
formatter.step({
  "name": "User should be in course details page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.userShouldBeInCourseDetailsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the batch names in dropdown options",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.userShouldSeeTheBatchNamesInDropdownOptions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select other batch",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.userShouldSelectOtherBatch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Faculty should give mock test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag13"
    }
  ]
});
formatter.step({
  "name": "Faculty should be in courses details",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldBeInCoursesDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on mock test",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.clickOnMockTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on play button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.clickOnPlayButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Faculty should take Quizzes",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag14"
    }
  ]
});
formatter.step({
  "name": "Faculty should be in Quizzes page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldBeInQuizzesPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should click on quizzes",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldClickOnQuizzes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should able see the quizzes",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldAbleSeeTheQuizzes()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Faculty taking Quizzes",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag15"
    }
  ]
});
formatter.step({
  "name": "Faculty should be in Quizzespage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldBeInQuizzespage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should click Quizzes",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldClickQuizzes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should click on take quizzes",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldClickOnTakeQuizzes()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Faculty should view quizz results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag16"
    }
  ]
});
formatter.step({
  "name": "Faculty should be in Quizz page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldBeInQuizzPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should should take Quizz",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldShouldTakeQuizz()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should click on view quizz Results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldClickOnViewQuizzResults()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Faculty should view Practice Venture",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag17"
    }
  ]
});
formatter.step({
  "name": "Faculty  dhould bein Quizzes",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.facultyDhouldBeinQuizzes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should see th Practice Venture",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldSeeThPracticeVenture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should click on Practice Venture",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldClickOnPracticeVenture()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Faculty should view PV Milestones",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag18"
    }
  ]
});
formatter.step({
  "name": "Faculty is in Quizzes",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.facultyIsInQuizzes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should see th PV Milestones",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldSeeThPVMilestones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should click on PV Milestones",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldClickOnPVMilestones()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@title\u003d\u0027\u0027]\"}\n  (Session info: chrome\u003d94.0.4606.71)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027rutisqq430\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.11.0-37-generic\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.71, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: /tmp/.com.google.Chrome.n6l2gZ}, goog:chromeOptions: {debuggerAddress: localhost:39095}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5e6fb867b4423efb144c6a76184707fb\n*** Element info: {Using\u003dxpath, value\u003d//a[@title\u003d\u0027\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.stepDefinition.StepDefinition1.facultyShouldClickOnPVMilestones(StepDefinition1.java:555)\n\tat ✽.Faculty should click on PV Milestones(src/test/resources/login.feature:136)\n",
  "status": "failed"
});
});