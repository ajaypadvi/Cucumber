package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = "definitions",
        tags = "@SmokeTest,@RegressionTest,@SanityTest,@MobileTest")
public class TestRunner {
}
