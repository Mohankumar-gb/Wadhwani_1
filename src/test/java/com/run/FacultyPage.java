package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepDefinition"},
tags= {"@tag,@tag2,@tag3,@tag4,@tag5,"
		+ "@tag6,@tag7,@tag8,@tag9,@tag10,"
		+ "@tag11,@tag12,@tag13,@tag14,@tag15,@tag16,@tag17,@tag18,@tag19,@tag20,"
		+ "@tag21,@tag22,@tag23,@tag24,@tag25,@tag26,@tag27,@tag28,@tag29"
		+ ",@tag30,@tag31,@tag32,@tag33,@tag34,@tag35,@tag36,@tag37,@tag38,@tag39,"
		+ "@tag40,@tag41,@tag42,@tag43,@tag44,@tag45,@tag46,@tag47,@tag48,@tag49,@tag50,"
		+ "@tag51,@tag52,@tag53,@tag54,@tag55,@tag56,@tag57,@tag58,@tag59,@tag60,@tag61,"
		+ "@tag62,@tag63,@tag64,@tag65,@tag66,@tag67,@tag68,@tag69,@tag70,@tag71"},
monochrome=true,dryRun=false
,snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:c:/home/qq429/eclipse-workspace/newmav/target/cucumber-reports/Cucumber.html"})


public class FacultyPage {
	
	

}




//@tags,@tags2,@tags3,@tags4,@tags5,
