package com.cucumber.mainExecution;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/feature/", glue = { "com.cucumber.stepDefinition" }, plugin = { "json:target/cucumber.json" })
public class TestRunner {

}
