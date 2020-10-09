Feature: Submit data to webdriver university using contact us form
  A user should be able to submit information via the contact us form
  If a user clicks on the reset button, then all information should be removed from the contact us form



#  Scenario: Enter valid data via contact form
#    Given I Access webdriveruniversity
#    When I click on the contact Us button
#    And I enter a "Vladimir" First Name
#    And I enter a "Hmmm" Last Name
#    And I enter a "hononovici@mail.ru" email address
#    And I enter comments
#    |Nice site bro|,But fix it|
#    When I click on the submit button
#    Then the information should successfully be submitted via the contact us form

  Scenario: Check Page Objects
    Given I access Contact Form
    When I enter a valid First Name
    And I enter a valid Last Name
      | woods | jackson | jones |
    And I enter a valid email address
    And I enter comments
      |example comment one | example comment two |
    When I click on the submit button
    Then the information should successfully be submitted via the contact us form