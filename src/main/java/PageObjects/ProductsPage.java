package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class ProductsPage extends BasePage {
    public @FindBy(css = "#container-special-offers")
    WebElement buttonSpecialOffers;

    public @FindBy(css = "#container-product2")
    WebElement buttonLaptops;

    public @FindBy(xpath = "//button[text()='Proceed']")
    WebElement buttonProceed;

    public @FindBy(xpath = ".//*[@id='myModal']//b[contains(text(), 'NEWCUSTOMER')]")
    WebElement buttonProceedPopupText;

    public ProductsPage() throws IOException {
        super();
    }

    public ProductsPage clickOnProceedButtonPopup() throws InterruptedException, IOException {
        waitAndClickElement(buttonSpecialOffers);
        return new ProductsPage();
    }

    public ProductsPage checkPopupStatus() throws IOException {
        WaitUntilWebElementIsVisible(buttonProceedPopupText);
        assertThat(buttonProceedPopupText.getText(),containsString("NEWCUSTOMER"));
        return new ProductsPage();
    }

}


