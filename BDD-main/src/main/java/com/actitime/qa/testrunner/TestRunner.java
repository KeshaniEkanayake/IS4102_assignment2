package com.actitime.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/User/Documents/uni/IS4102_SQA/BDD-main/src/main/java/com/actitime/qa/feature/Loging.feature","/Users/User/Documents/uni/IS4102_SQA/BDD-main/src/main/java/com/actitime/qa/feature/addingUser.feature"}
//		features = {"C:\\Users\\s.kadigamugedara_exa\\Documents\\Uni\\BDD_Demo-main\\src\\main\\java\\com\\actitime\\qa\\feature\\Loging.feature"}
		,glue={"com/actitime/qa/stepdefinitions"}
		,monochrome = true,
				strict=true,
				dryRun=false
				
		)

public class TestRunner {
	
	
	

}
