Feature: Changing the personal information

  Background:
    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button

  Scenario Outline: Updating the personal information2

    When Click on my personal information tab
    And Clear the old name and type the "<new name>"
    And Type the current "<password>"
    And Type the "<new password>"
    And Confirm the "<new password>"
    And Click on the Save Button
    And Click on Sign Out tab
    Examples:
      | new name   | password   | new password |
      | Atlanta    | 0123456789 | 0123456789   |
      | Alpharetta | 0123456789 | 0123456789   |

