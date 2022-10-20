package com.cucumberdemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue="com.cucumberdemo.stepdefinitions",
        features="src/test/resources/com.cucumberdemo/login.feature",
        plugin={"pretty", "html:target/cucumber.html"},
        dryRun=false

)
public class testrunner {

}
