package PageObjects;

import io.cucumber.datatable.DataTable;
import lombok.var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ContactUsPage extends BasePage{

    public @FindBy(css = "input.feedback-input:nth-child(1)")
    WebElement textFieldFirstName;
    public @FindBy(css = "input.feedback-input:nth-child(2)")
    WebElement textFieldLastName;
    public @FindBy(css = "input.feedback-input:nth-child(3)")
    WebElement textFieldEmailAddress;
    public @FindBy(css = "textarea.feedback-input")
    WebElement textFieldComments;
    public @FindBy(css = "input.contact_button:nth-child(2)")
    WebElement buttonSubmit;
    public @FindBy(css = "input.contact_button:nth-child(1)")
    WebElement buttonReset;

    public ContactUsPage() throws IOException {
        super();
    }

    public ContactUsPage getContactUsPage() throws IOException {
        getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        return new ContactUsPage();
    }

    public ContactUsPage enterFirstName() throws Exception {
        sendKeysToWebElement(textFieldFirstName, "Tom");
        return new ContactUsPage();
    }

    public ContactUsPage enterLastName(DataTable dataTable, int row, int column) throws Exception {
        var data = dataTable.cells();
        sendKeysToWebElement(textFieldLastName, data.get(row).get(column));
        return new ContactUsPage();
    }

    public ContactUsPage enterEmailAddress(String email) throws Exception {
        sendKeysToWebElement(textFieldEmailAddress, email);
        return new ContactUsPage();
    }

    public ContactUsPage enterComments(DataTable dataTable, int row, int column) throws Exception {
        var data = dataTable.cells();
        sendKeysToWebElement(textFieldComments, data.get(row).get(column));
        return new ContactUsPage();
    }

    public ContactUsPage clickOnSubmitButton() throws Exception {
        waitAndClickElement(buttonSubmit);
        return new ContactUsPage();
    }

    public ContactUsPage confirmContactUsFormSubmissionWasSuccesful() throws IOException {
        WebElement thanksContactUsPage = getDriver().findElement(By.cssSelector("#contact_reply > h1:nth-child(1)"));
        WaitUntilWebElementIsVisible(thanksContactUsPage);
        assertThat(thanksContactUsPage.getText(),equalTo("Thank You for your Message!"));
        return new ContactUsPage();
    }


}
