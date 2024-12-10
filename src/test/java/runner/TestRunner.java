package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import com.cucumber.listener.ExtentCucumberFormatter;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =  "src/test/resources/features/HomePage.feature",
        glue =      {"stepDefinitions"},
        plugin =   {"pretty", "html:target/cucumber-reports/Report.html",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/MyExtentReport.html"},
        monochrome =    true
)

public class TestRunner {
}
