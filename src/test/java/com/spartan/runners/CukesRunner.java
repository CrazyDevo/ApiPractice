package com.spartan.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html", //html report
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"}, // cucumber report
        features = "src/test/resources/features",
        glue = "com/spartan/step_definitions",
        dryRun = false,
        tags = "@property"
)
public class CukesRunner {


}
