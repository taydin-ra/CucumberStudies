Feature: Changing the personal information

  Background:
    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button


  Scenario Outline: Updating the personal information2

    And Click on my personal information tab
    And Clear the old name and type the "<new name>"
    And Clear the old last name and type the "<new last name>"
    And Type the "<email address>"
    And Type the current "<password>"
    Examples:
      | new name   | new last name | email address      | password   |
      | Atlanta    | Group         | ttorun16@gmail.com | 0123456789 |
      | Alpharetta | Group1        | ttorun16@gmail.com | 0123456789 |
