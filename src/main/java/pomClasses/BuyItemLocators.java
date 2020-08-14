package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BaseDriver;

public class BuyItemLocators extends BasePom {
    private WebDriver driver;

    public BuyItemLocators() {
        driver = BaseDriver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    private WebElement dressesTab;

    @FindBy(xpath = "//li//div//a//img[@title='Printed Chiffon Dress']")
    private WebElement printedDress;

    @FindBy(css = "button[name='Submit']>span")
    private WebElement addToCart;

    @FindBy(xpath = "//iframe[@class='fancybox-iframe']")
    public WebElement myFrame;

    @FindBy(xpath = "//div[@class='button-container']//a")

    private WebElement proceedToCheckOutFirst;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//span")
    private WebElement proceedToCheckOutSecond;

    @FindBy(xpath = "//td[@class='price' and @id='total_product']")

    private WebElement totalProducts;

    @FindBy(css = "td#total_shipping")

    private WebElement totalShipping;

    @FindBy(id = "total_price_without_tax")

    private WebElement totalPrice;

    @FindBy(css = "[name=\"processAddress\"]")

    private WebElement proceedToCheckOutAddress;

    @FindBy(css = "input#cgv")

    private WebElement agreementCheckBox;

    @FindBy(css = "a[title='Pay by bank wire']")

    private WebElement paymentType;

    @FindBy(css = "button[name='processCarrier']")

    private WebElement shippingProceed;

    @FindBy(xpath = "//span[text()='I confirm my order']")

    private WebElement confirmation;

    @FindBy(xpath = "//p//strong")

    private WebElement orderCompleteMessage;


    public void ClickOnDresses() {

        clickOnFunctionalities(dressesTab);
    }

    public void ClickOnPrintedDresses() {
        ScrollDown(printedDress);
        clickOnFunctionalities(printedDress);
    }

    public void clickOnAddToCart() {
        driver.switchTo().frame(myFrame);
        waitMethod();
        clickOnFunctionalities(addToCart);
    }

    public void clickOnProceedToCheckOut() {
        clickOnFunctionalities(proceedToCheckOutFirst);
    }

    public void clickSecondProceed() {
        clickOnFunctionalities(proceedToCheckOutSecond);
    }

    public void clickOnAddressProceed() {

        try {
            clickOnFunctionalities(proceedToCheckOutAddress);

        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", proceedToCheckOutAddress);
            clickOnFunctionalities(proceedToCheckOutAddress);

        }
    }

    public void clickShippingProceed() {
        clickOnFunctionalities(shippingProceed);
    }

    public void ClickOnPaymentType() {
        clickOnFunctionalities(paymentType);
    }

    public void ClickOnConfirmation() {
        clickOnFunctionalities(confirmation);
    }

    public void clickAgreementCheck() {
        clickOnFunctionalities(agreementCheckBox);
    }


    public void verifyTotal() {
        String totalPr = totalProducts.getText();
        String totalShip = totalShipping.getText();
        String total = totalPrice.getText();

        totalPr = totalPr.replace("$", "");
        totalShip = totalShip.replace("$", "");
        total = total.replace("$", "");

        double totalprice = Double.parseDouble(totalPr);
        double totalshipping = Double.parseDouble(totalShip);

        double Total = Double.parseDouble(total);

        double allTotal = totalprice + totalshipping;

        Assert.assertEquals(Total, allTotal);

        System.out.println(totalprice);


    }

    public void verifyOrderComplete(){
        String myOrder=orderCompleteMessage.getText();
        Assert.assertEquals("Your order on My Store is complete.",myOrder);
        System.out.println(myOrder);
    }


}
