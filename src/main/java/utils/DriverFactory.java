package utils;

import PageObjects.ContactUsPage;
import PageObjects.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public static ContactUsPage contactUsPage;
    public static ProductsPage productsPage;

    public static WebDriver getDriver() {
        try {
//            ReadConfigFile file = new ReadConfigFile();
//            String browserName = file.getBrowser();
            Properties p = new Properties();
            FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
            p.load(fi);
            String browserName = p.getProperty("browser");

            switch (browserName) {

                case "firefox":
                    if (driver == null) {
                        System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
                        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                        capabilities.setCapability("marionette", true);
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                    }
                    break;
                case "chrome":

                    if (driver == null) {
                        System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();

                    }
                    break;

//                case "ie":
//
//                    if (driver == null) {
//                        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//                        System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
//                        capabilities.setCapability("ignoreZoomSetting", true);
//                        driver = new InternetExplorerDriver(capabilities);
//                        driver.manage().window().maximize();
//                    }
//                    break;
            }
        } catch (
                Exception e) {
            System.out.println("Driver cannot be instantied");
        } finally {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
            productsPage = PageFactory.initElements(driver, ProductsPage.class);
        }
        return driver;
    }

}
