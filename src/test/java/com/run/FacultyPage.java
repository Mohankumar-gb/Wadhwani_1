package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepDefinition"},
tags= {"@tags,@tags2,@tags3,@tags4,@tags5,"
		+ "@tag6,@tag7,@tag8,@tag9,@tag10,"
		+ "@tag11,@tag12,@tag13,@tag14,@tag15,@tag16,@tag17,@tag18,@tag19,@tag20,"
		+ "@tag21,@tag22,@tag23,@tag24,@tag25,@tag26,@tag27,@tag28,@tag29"
		+ ",@tag30,@tag31,@tag32,@tag33,@tag34,@tag35,@tag36"},
monochrome=true,dryRun=false
,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:c:/home/qq429/eclipse-workspace/newmav/target/cucumber-reports/Cucumber.html"})


public class FacultyPage {
	
	

}




//@tags,@tags2,@tags3,@tags4,@tags5,
