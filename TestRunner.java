package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"C:\\Users\\admin\\Documents\\workspace-spring-tools-for-eclipse-4.30.0.RELEASE\\Cucumber\\SimpleForm\\SimpleForm.feature"},
    glue = {"SimpleFormSteps"},
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
