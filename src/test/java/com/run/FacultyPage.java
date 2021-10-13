package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepDefinition"},
tags= {"@tags,@tags2,@tags3,@tags4,@tags5,@tags6,@tag7,@tag8,@tag9,@tag10,@tag11,@tag12,@tag13,@tag14,@tag15,@tag16,@tag17,@tag18"},
monochrome=true,dryRun=false
,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:c:/home/qq429/eclipse-workspace/newmav/target/cucumber-reports/Cucumber.html"})


public class FacultyPage {
	

}








//@tags,@tags2,@tags3,@tags4,@tags5,@tags6,@tag7,@tag8,@tag9,@tag10,@tag11,@tag12,@tag13