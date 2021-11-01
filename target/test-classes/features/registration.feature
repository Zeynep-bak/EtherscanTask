

@wip
Feature: Registration functionality
  Agile story: As a user I should be able to register new account

  Background:
    Given  the user on the registration page

  Scenario: Registration with valid credentials
    When the user enters "username" "password" "email" "confirmpassword"
    And the user clicks to "Terms and Conditions"
    And the user clicks to "Receive newsletters"
    And the user clicks to "I am not a Robot"
    And  the user clicks to "Create an Account"
    Then "Your account has been successfully registered and pending for email verification."message appear

    Scenario: Register without click Recieve newletters checkbox
      When the user enters "username" "password" "email" "confirmpassword"
      And the user clicks to "Terms and Conditions"
      And the user clicks to "I am not a Robot"
      And  the user clicks to "Create an Account"
      Then "Your account has been successfully registered and pending for email verification."message appear

      @Negative
      Scenario Outline: Enter invalid credentials
        When the user enters "<username>" "<password>" "<email>" "<confirmpassword>"
        And the user clicks to "Terms and Conditions"
        And the user clicks to "Receive newsletters"
        And the user clicks to "I am not a Robot"
        And  the user clicks to "Create an Account"
        Examples:
        |username|password|email|confirmpassword|
        |