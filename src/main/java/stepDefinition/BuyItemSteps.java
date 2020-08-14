package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import pomClasses.BasePom;
import pomClasses.BuyItemLocators;

public class BuyItemSteps extends BasePom {

    BuyItemLocators buyItemLocator = new BuyItemLocators();

    @When("^I click on Dresses$")
    public void i_click_on_Dresses() throws Throwable {
        buyItemLocator.ClickOnDresses();

    }

    @When("^Click on any dress$")
    public void click_on_any_dress() throws Throwable {
        Thread.sleep(3000);

        buyItemLocator.ClickOnPrintedDresses();

    }

    @When("^Click on add to cart button$")
    public void click_on_add_to_cart_button()  {
        buyItemLocator.clickOnAddToCart();

    }

    @When("^Click on proceed to checkout$")
    public void click_on_proceed_to_checkout() throws InterruptedException {
        Thread.sleep(3000);

        buyItemLocator.clickOnProceedToCheckOut();
      //  buyItemLocator.clickSecondProceed();

        Thread.sleep(3000);

    }

    @Then("^Verify the total price equals total products and shipping$")
    public void verify_the_total_price_equals_total_products_and_shipping() {

        buyItemLocator.verifyTotal();

    }
    @Then("^Click on proceed to checkout on the price page$")
    public void click_on_proceed_to_checkout_on_the_price_page() throws Throwable {
        buyItemLocator.clickSecondProceed();
    }

    @Then("^Click on proceed to checkout on the address page$")
    public void click_on_proceed_to_checkout_on_the_address_page() throws Throwable {
        buyItemLocator.clickOnAddressProceed();

    }

    @Then("^Click on the agreement checkbox$")
    public void click_on_the_agreement_checkbox() throws Throwable {
        buyItemLocator.clickAgreementCheck();

    }

    @Then("^Click on proceed to checkout on the shipping page$")
    public void click_on_proceed_to_checkout_on_the_shipping_page() throws Throwable {
        buyItemLocator.clickShippingProceed();

    }

    @Then("^Click on payment by wire$")
    public void click_on_payment_by_wire() throws Throwable {
        buyItemLocator.ClickOnPaymentType();

    }

    @Then("^Click on I confirm my order button$")
    public void click_on_I_confirm_my_order_button() throws Throwable {
        buyItemLocator.ClickOnConfirmation();

    }

    @Then("^Verify Order confirmation text  is displayed$")
    public void verify_Order_confirmation_text_is_displayed() throws Throwable {
        buyItemLocator.verifyOrderComplete();

    }

}
