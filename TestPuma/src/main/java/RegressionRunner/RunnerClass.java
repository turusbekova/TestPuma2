package RegressionRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = {"classpath:features"},
        glue = {"cucumber/Step_Defs"},
        tags = {"@Smoke"},
        dryRun = true
)
public class RunnerClass {
}
