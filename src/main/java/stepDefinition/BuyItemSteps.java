package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
        buyItemLocator.clickSecondProceed();

    }

    @Then("^Verify the total price equals total products and shipping$")
    public void verify_the_total_price_equals_total_products_and_shipping() throws InterruptedException {
        Thread.sleep(3000);
        buyItemLocator.verifyTotal();

    }

    @Then("^Click on proceed to checkout in the order page$")
    public void click_on_proceed_to_checkout_in_the_order_page() throws Throwable {
        buyItemLocator.clickOnProceedToCheckOut();
    }

    @Then("^Click on proceed to checkout in the address page$")
    public void click_on_proceed_to_checkout_in_the_address_page()  {
        buyItemLocator.clickOnLastProceed();

    }

    @Then("^Click on the agreement checkbox$")
    public void click_on_the_agreement_checkbox()  {
        buyItemLocator.clickAgreementCheck();

    }

    @Then("^Click on the proceed to checkout button$")
    public void click_on_the_proceed_to_checkout_button()  {
        buyItemLocator.clickShippingProceed();

    }

    @Then("^Click on pay by bank wire$")
    public void click_on_pay_by_bank_wire(){
        buyItemLocator.ClickOnPaymentType();

    }

    @Then("^Click on I confirm order$")
    public void click_on_I_confirm_order()  {
        buyItemLocator.ClickOnConfirmation();

    }

    @Then("^Verify Order confirmation text  is displayed$")
    public void verify_Order_confirmation_text_is_displayed()  {

    }
}
