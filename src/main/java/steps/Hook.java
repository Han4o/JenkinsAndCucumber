package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class Hook extends DriverFactory {

    @Before
    public void runDriver() {
        driver = getDriver();
    }

    @After
    public void closeDriverAndScreenshotOnFailure(Scenario scenario) {
        try {
            if (driver != null && scenario.isFailed()){
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png", "Screenshot" );
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }


                if (driver != null) {
                    driver.manage().deleteAllCookies();
                    driver.quit();
                    driver = null;
                }
        } catch (Exception e) {
            System.out.println("Methods failed: tearDownAndScreenshotFailure, Exception: " + e.getMessage());
        }
    }

}
