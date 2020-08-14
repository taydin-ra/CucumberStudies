Feature: Create an account
  Scenario: Creating account

    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button
    Then Verify I am in the product page

  Scenario:Proceed to checkout
    And Click on proceed to checkout in the order page
    And Click on proceed to checkout in the address page
    And Click on the agreement checkbox
    And Click on the proceed to checkout button
    And Click on pay by bank wire
    And Click on I confirm order
    Then Verify Order confirmation text  is displayed