package ui.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"me.jvt.cucumber.report.PrettyReports:target/cucumber","pretty","html:reports/html/index.html"},
        features = "src/test/resources/features",
        glue="ui.stepDefinition"
)
public class RunnerTest {
}
