Feature: Validate login functionality on web application
    As a customer
  	I want to login to the application
  	So I can learn how to monitor my baby

  Scenario: Validate login details in the web application
    Given that user is on home page
    When I login with username "dine@yahoo.com" and password " 12345abc"
    Then I should see "Welcome" message
