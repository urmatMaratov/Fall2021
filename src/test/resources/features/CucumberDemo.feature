Feature: Login functionality
 # here we would write the feature name to be tested
  # We create one feature file per feature(functionality)

  #Gherkin language -->Given, When, and, Then

   Background: User is on FaceBook
     Given User is logged in to https://www.facebook.com/

  Scenario: Verify user can login with valid credentials
    # Given steps are used for precondition

    # When Action
    When User enter test@test.com to email field
    # And
    And User should enter Hello1234 in password input field
    And User should click on Log In button
    # Then Validation
    Then User should successfully logged in to the Facebook

  Scenario: Verify user can login with valid password and invalid login
    # Given steps are used for precondition

    # When Action
    When User enter test123.com to email field
    # And
    And User should enter Hello12345 in password input field
    And User should click on Log In button
    # Then Validation
    Then User should not be able to log in to the Facebook