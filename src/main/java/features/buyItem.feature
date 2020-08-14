Feature: Buy a new item from the website

  Background:
    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button

  Scenario: Buying any dress from the given website
    When I click on Dresses
    And Click on any dress
    And Click on add to cart button
    And Click on proceed to checkout
    Then Verify the total price equals total products and shipping
    And Click on proceed to checkout on the price page
    And Click on proceed to checkout on the address page
    And Click on the agreement checkbox
    And Click on proceed to checkout on the shipping page
    And Click on payment by wire
    And Click on I confirm my order button
    Then Verify Order confirmation text  is displayed








