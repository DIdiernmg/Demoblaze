Feature: User Registration and Login

  As a new user of the application
  I want to sign up and then log in
  So that I can access the application's functionalities

  Scenario: User successfully registers and logs in
    Given the user is on the homepage
    When the user navigates to the registration page
    And the user enters a valid username and password
    And the user clicks on the sign-up button
    Then the user receives a confirmation of successful registration

    Given the user is on the homepage
    When the user navigates to the login page
    And the user enters their valid username and password
    And the user clicks on the login button
    Then the user is redirected to their account dashboard