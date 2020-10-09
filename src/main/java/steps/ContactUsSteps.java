package steps;

import PageObjects.ContactUsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

import java.io.IOException;

import static org.junit.Assert.assertThat;

public class ContactUsSteps extends DriverFactory {


//    @Given("I Access webdriveruniversity")
//    public void iAccessWebdriveruniversity() {
//        driver.get("http://webdriveruniversity.com/");
//    }
//
//    @When("I click on the contact Us button")
//    public void iClickOnTheContactUsButton() {
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/a/div/div[1]/h1")).click();
//    }
//
//    @And("I enter a {string} First Name")
//    public void iEnterAFirstName(String username){
//        String winHandleBefore = driver.getWindowHandle();
//
//        for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//        }
//        WebDriverWait wait = new WebDriverWait(driver,1);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]")));
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]")).sendKeys(username);
//    }
//
//    @And("I enter a {string} Last Name")
//    public void iEnterALastName(String lastname) {
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]")).sendKeys(lastname);
//    }
//
//    @And("I enter a {string} email address")
//    public void iEnterAEmailAddress(String email) {
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]")).sendKeys(email);
//    }
//
//    @And("I enter comments")
//    public void iEnterComments(DataTable datatable) {
//        var table = datatable.cells();
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea")).sendKeys(table.get(0).get(0));
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea")).sendKeys(table.get(0).get(1));
//    }
//
//    @When("I click on the submit button")
//    public void iClickOnTheSubmitButton() {
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/div/input[2]")).click();
//        assertThat(driver.findElement(By.xpath("/html/body/div/div/div/h1")).getText(),containsString("Thank You for your Message!"));
//    }
//
//    @Then("the information should successfully be submitted via the contact us form")
//    public void theInformationShouldSuccessfullyBeSubmittedViaTheContactUsForm() {
//    }
//
//    @And("I enter not valid username")
//    public void iEnterNotValidUsername() {
//    }
//
//    @And("I enter not valid password")
//    public void iEnterNotValidPassword() {
//    }
//
//    @And("I enter not valid email address")
//    public void iEnterNotValidEmailAddress() {
//    }
//
//    @And("I enter not valid comments")
//    public void iEnterNotValidComments() {
//    }
//
//    @When("I click on the reset button")
//    public void iClickOnTheResetButton() {
//    }
//
//    @Then("the information should be deleted from the form")
//    public void theInformationShouldBeDeletedFromTheForm() {
//    }

    @Given("I access Contact Form")
    public void iAccessContactForm() throws IOException {
        contactUsPage.getContactUsPage();
    }

    @When("I enter a valid First Name")
    public void iEnterAValidFirstName() throws Exception {
      contactUsPage.enterFirstName();
    }

    @And("I enter a valid Last Name")
    public void iEnterAValidLastName(DataTable dataTable) throws Exception {
        contactUsPage.enterLastName(dataTable,0,1);
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() throws Exception {
        contactUsPage.enterEmailAddress("hello@mail.ru");
    }

    @And("I enter comments")
    public void iEnterComments(DataTable dataTable) throws Exception {
        contactUsPage.enterComments(dataTable,0,1);
    }

    @When("I click on the submit button")
    public void iClickOnTheSubmitButton() throws Exception {
        contactUsPage.clickOnSubmitButton();
    }

    @Then("the information should successfully be submitted via the contact us form")
    public void theInformationShouldSuccessfullyBeSubmittedViaTheContactUsForm() throws IOException {
        contactUsPage.confirmContactUsFormSubmissionWasSuccesful();
    }
}

