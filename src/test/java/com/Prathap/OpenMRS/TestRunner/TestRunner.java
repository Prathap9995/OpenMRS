package com.Prathap.OpenMRS.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/Prathap/OpenMRS/Feature",
		glue = {"com.Prathap.OpenMRS.StepDefinition"},
		plugin = {"pretty", "html:target/Report.html"},
		monochrome = true
		
		)

public class TestRunner {

}
