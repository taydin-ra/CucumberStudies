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
      And Click on proceed to checkout in the order page
      And Click on proceed to checkout in the address page
      And Click on the agreement checkbox
      And Click on the proceed to checkout button
      And Click on pay by bank wire
      And Click on I confirm order
      Then Verify Order confirmation text  is displayed



