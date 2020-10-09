$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/ContactUs.feature");
formatter.feature({
  "name": "Submit data to webdriver university using contact us form",
  "description": "  A user should be able to submit information via the contact us form\n  If a user clicks on the reset button, then all information should be removed from the contact us form",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check Page Objects",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I access Contact Form",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.ContactUsSteps.iAccessContactForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid First Name",
  "keyword": "When "
});
formatter.match({
  "location": "steps.ContactUsSteps.iEnterAValidFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid Last Name",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "steps.ContactUsSteps.iEnterAValidLastName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid email address",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ContactUsSteps.iEnterAValidEmailAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter comments",
  "rows": [
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "steps.ContactUsSteps.iEnterComments(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.ContactUsSteps.iClickOnTheSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the information should successfully be submitted via the contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ContactUsSteps.theInformationShouldSuccessfullyBeSubmittedViaTheContactUsForm()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Screenshot");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/Features/products.feature");
formatter.feature({
  "name": "Products",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to \"\u003curl\u003e\" website",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the \"\u003cbutton\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should be presented with a promo alert",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "button"
      ]
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Page-Object-Model/products.html",
        "#container-special-offers"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to \"http://webdriveruniversity.com/Page-Object-Model/products.html\" website",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.ProductSteps.userNavigatesToWebsite(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the \"#container-special-offers\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.ProductSteps.userClicksOnThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be presented with a promo alert",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.ProductSteps.userShouldBePresentedWithAPromoAlert()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Screenshot");
formatter.after({
  "status": "passed"
});
});