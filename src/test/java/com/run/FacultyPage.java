package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepDefinition"},
tags= {"@tags3"},monochrome=true,dryRun=false,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:c:/home/qq429/eclipse-workspace/newmav/target/cucumber-reports/Cucumber.html"})


public class FacultyPage {
	
	

}//@tags,@tags2,@tags3,@tags4,@tags5,@tags6,@tags7,@tags8,@tags9,@tags10,@tags11,@tags12,@tags13,@tags14,@tags15,@tags16,@tags17,@tags18,@tags19,@tags20,@tags21,@tags22,@tags23,@tags24,@tags25,@tags26,@tags27,@tags31,@tags35