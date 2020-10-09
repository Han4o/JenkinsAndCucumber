package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"},
        monochrome = true
)
public class MainRunner {

}
