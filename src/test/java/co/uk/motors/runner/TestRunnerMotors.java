package co.uk.motors.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = {"src/test/java/co/uk/motors/features"},
        plugin = {"pretty", "json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/Pretty-cucumber"},
        glue = {"co/uk/motors/stepdefinitions"}
)
public class TestRunnerMotors {
}
