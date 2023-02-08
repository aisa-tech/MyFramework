package com.Ascom.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/Ascom/step_definitions"
)

// This runner class will be running only failed scenarios
public class FailedTestRunner {


}

