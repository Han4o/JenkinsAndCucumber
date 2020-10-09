package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.io.IOException;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class ProductSteps extends DriverFactory {


    @Given("User navigates to {string} website")
    public void userNavigatesToWebsite(String url) {
        getDriver().get(url);
    }

    @When("User clicks on the {string}")
    public void userClicksOnThe(String locator) throws IOException, InterruptedException {
        productsPage.clickOnProceedButtonPopup();
    }

    @Then("User should be presented with a promo alert")
    public void userShouldBePresentedWithAPromoAlert() throws IOException {
        productsPage.checkPopupStatus();
    }
}
