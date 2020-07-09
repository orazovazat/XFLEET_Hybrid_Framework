package xfleet.tests.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
//        tags = {"@storemanager"},                                     // ~ or not before tag ignore scenario
        features = {"src/test/resources/features"},
        glue = {"xfleet/tests/cucumber/step_definitions"},
        dryRun = false

)
public class CukesRunner {
}
