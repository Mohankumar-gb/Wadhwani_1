package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepDefinition"},
tags= {"@tags,@tags2,@tags3,@tags4,@tags5"},monochrome=true,dryRun=false,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:c:/home/qq429/eclipse-workspace/newmav/target/cucumber-reports/Cucumber.html"})


public class FacultyPage {
	

}
