$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "Login cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Functionality with invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags19"
    }
  ]
});
formatter.step({
  "name": "Faculty is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Faculty should enter invalid \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Faculty should click next Button",
  "keyword": "And "
});
formatter.step({
  "name": "Faculty should enter the invalid password\"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Faculty should verify its  success message",
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
        "password"
      ]
    },
    {
      "cells": [
        "qapital.faculty@yopmail.com",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Functionality with invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tags19"
    }
  ]
});
formatter.step({
  "name": "Faculty is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition1.facultyIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should enter invalid \"qapital.faculty@yopmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldEnterInvalid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should click next Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldClickNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Faculty should enter the invalid password\"1234\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldEnterTheInvalidPassword(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Failed to convert data to an object\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027rutisqq429\u0027, ip: \u0027192.168.43.24\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.4.0-42-generic\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 79.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200720193547, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 11627, moz:profile: /tmp/rust_mozprofiley9VEX7, moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, platformVersion: 5.4.0-42-generic, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 560047bc-522d-4f13-bee9-f58f555db6cc\n*** Element info: {Using\u003did, value\u003dpassword}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat POM.LoginPom.facultyPassword(LoginPom.java:57)\n\tat com.stepDefinition.StepDefinition1.facultyShouldEnterTheInvalidPassword(StepDefinition1.java:491)\n\tat ✽.Faculty should enter the invalid password\"1234\"(src/test/resources/login.feature:212)\n",
  "status": "failed"
});
formatter.step({
  "name": "Faculty should verify its  success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.facultyShouldVerifyItsSuccessMessage()"
});
formatter.result({
  "status": "skipped"
});
});