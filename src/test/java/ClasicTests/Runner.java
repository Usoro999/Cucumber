package ClasicTests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"CucumberSteps"},
        tags = "@smoketest"
)
public class Runner extends AbstractTestNGCucumberTests {
}
