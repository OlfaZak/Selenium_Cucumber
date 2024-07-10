package com.e2eTests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty", "html:target/Cucumber_Report.html", "json:target/cucumber.json"},
		tags = ("@ajoutProduit"),
		//glue = {"src/test/java/com/e2eTests/automation/step_definitions"},
		monochrome = false,
		snippets = CAMELCASE
		)
public class RunWebSuitTest {
	 		


    }
