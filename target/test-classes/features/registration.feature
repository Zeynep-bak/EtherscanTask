

@wip
Feature: Registration functionality
  Agile story: As a user I should be able to register new account

  Background:
    Given  the user on the registration page

  Scenario: Registration with valid credentials
    When the user enters "username" "password" "email@gmail.com" "password"
    And the user clicks to "I agree to the "
    And the user clicks to "I agree to receive the"
    And the user clicks to "I am not a robot"
    And  the user clicks to "Create an Account"
    Then "Your account has been successfully registered and pending for email verification."message appear

    Scenario: Register without click Recieve newletters checkbox
      When the user enters "username" "password" "email@gmail.com" "confirmpassword"
      And the user clicks to "I agree to the "
      And the user clicks to "I am not a robot"
      And  the user clicks to "Create an Account"
      Then "Your account has been successfully registered and pending for email verification."message appear

      @Negative
  Scenario Outline: Enter invalid credentials
     When the user enters "<username>" "<password>" "<email>" "<confirmpassword>"
     And the user clicks to "I agree to the "
     And the user clicks to "I agree to receive the"
     And the user clicks to "I am not a robot"
     And  the user clicks to "Create an Account"
     Then "<message>" message should appeare

     Examples:
          | username | password | email             | confirmpassword | message                                           |
          |          | ABC123   | abc@gmail.com     | ABC123          | Username is invalid.                              |
          | A        | ABC123   | abc@gmail.com     | ABC123          | Username is invalid.                              |
          | AB       | ABC123   | abc@gmail.com     | ABC123          | Username is invalid.                              |
          | ABC      | ABC123   | abc@gmail.com     | ABC123          | Username is invalid.                              |
          | ABCD     | ABC123   | abc@gmail.com     | ABC123          | Username is invalid.                              |
          | ABCDE1   | ABC125   |                   | ABC125          | Please enter a valid email address.               |
          | ABCDE1   | ABC125   | abc@.com          | ABC125          | Please enter a valid email address.               |
          | ABCDE2   | ABC126   | abc@              | ABC126          | Please enter a valid email address.               |
          | ABCDEF1  | ABCDE12  | abc@gmail         | ABCDE12         | Invalid email format. abc@gmail                   |
          | Mariana  |          | xvcc@gmail.com    |                 | Your password must be at least 5 characters long. |
          | Mariana  |          | xvcc@gmail.com    | A               | Your password must be at least 5 characters long. |
          | Mariana  | A        | xvcc@gmail.com    |                 | Your password must be at least 5 characters long. |
          | Mariana  | A        | xvcc@gmail.com    | A               | Your password must be at least 5 characters long. |
          | Mariana  | AB       | xvcc@gmail.com    | AB              | Your password must be at least 5 characters long. |
          | Mariana  | ABC      | xvcc@gmail.com    | ABC             | Your password must be at least 5 characters long. |
          | Mariana  | ABCD     | xvcc@gmail.com    | ABCD            | Your password must be at least 5 characters long. |
          | ABCDE    | ABC124   | abc@gmail.com     | ABC12           | Password does not match, please check again.      |
          | Andres   | ABS123   | andresa@gmail.com | ABS1            | Password does not match, please check again.      |


  Scenario Outline: Enter with same valid credentials
    When the user enters "<username>" "<password>" "<email>" "<confirmpassword>"
    And the user clicks to "I agree to the "
    And the user clicks to "I agree to receive the"
    And the user clicks to "I am not a robot"
    And  the user clicks to "Create an Account"
    Then "<message>" message should appeare

    Examples:
      | username | email          | password | confirmpassword | message                                                                           |
      | ABCDEF   | abc@gmail.com  | ABCDEF   | ABCDEF          | Your account has been successfully registered and pending for email verification. |
      | ABCDEF   | abc1@gmail.com | ABCDEF1  | ABCDEF1         | Sorry! The username you entered is already in use.                                |
      | xyztKL1  | xyz@gmail.com  | XYZTKL   | XYZTKL          | Your account has been successfully registered and pending for email verification. |
      | xyztKL2  | xyz@gmail.com  | XYZTKL2  | XYZTKL2         | Sorry! The email address you entered is already in use.                           |
      | ABCDEKL  | kjh@gmail.com  | 123456   | 123456          | Your account has been successfully registered and pending for email verification. |
      | QRCDEKL  | qrh@gmail.com  | 123456   | 123456          | Your account has been successfully registered and pending for email verification. |

 Scenario: Register without click Terms and conditions checkbox
   When the user enters "username" "password" "email" "password"
   And the user clicks to "I agree to the "
   And the user clicks to "I'm not a robot"
   And  the user clicks to "Create an Account"
   Then "<message>" message should appeare

  Scenario: Register without click I am not a robot checkbox
    When the user enters "username" "password" "email" "password"
    And the user clicks to "I agree to the "
    And the user clicks to "I agree to receive the"
    And  the user clicks to "Create an Account"
    Then "<message>" message should appeare