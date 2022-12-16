package CucumberSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/CucumberFeatures",
        glue = {"CucumberSteps"},
        tags = "@smoketest"
)
public class Runner extends AbstractTestNGCucumberTests {
}
