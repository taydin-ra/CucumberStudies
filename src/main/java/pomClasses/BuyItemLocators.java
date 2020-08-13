package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    public void ClickOnDresses() {
        clickOnFunctionalities(dressesTab);
    }

    @FindBy(xpath = "//li//div//a//img[@title='Printed Chiffon Dress']")

    private WebElement printedDress;

    public void ClickOnPrintedDresses() {
        ScrollDown(printedDress);
        clickOnFunctionalities(printedDress);
    }


    @FindBy(css = "button[name='Submit']>span")

    private WebElement addToCart;

    @FindBy(xpath="//iframe[@class='fancybox-iframe']")

    public WebElement myFrame;

    public void clickOnAddToCart() {
        driver.switchTo().frame(myFrame);
        waitMethod();
        clickOnFunctionalities(addToCart);
    }

    @FindBy(xpath = "//div[@class='button-container']//a")

    private WebElement proceedToCheckOutFirst;

    public void clickOnProceedToCheckOut() {
        clickOnFunctionalities(proceedToCheckOutFirst);
    }

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//span")
    private  WebElement proceedToCheckOutSecond;

    @FindBy(css = "td#total_product")

    private WebElement totalProducts;

    @FindBy(css = "td#total_shipping")

    private WebElement totalShipping;

    @FindBy(css = "td#total_price")

    private WebElement totalPrice;

    @FindBy(css = "button[name='processAddress']")

    private WebElement proceedToCheckOutLast;

    @FindBy(css = "input#cgv")

    private WebElement agreementCheckBox;

    @FindBy(css = "a[title='Pay by bank wire']")

    private WebElement paymentType;



    @FindBy(css = "button[name='processCarrier']")

    private WebElement shippingProceed;


    @FindBy(xpath = "//span[text()='I confirm my order']")

    private WebElement confirmation;

    public void clickSecondProceed(){
        clickOnFunctionalities(proceedToCheckOutSecond);
    }

    public void clickShippingProceed(){
        clickOnFunctionalities(shippingProceed);
    }

    public void ClickOnPaymentType(){
        clickOnFunctionalities(paymentType);
    }

    public void ClickOnConfirmation(){
        clickOnFunctionalities(confirmation);
    }
    public void clickAgreementCheck(){
        clickOnFunctionalities(agreementCheckBox);
    }

    public void clickOnLastProceed(){
        clickOnFunctionalities(proceedToCheckOutLast);
    }

    public void verifyTotal() {
        String  totalPr=totalProducts.getText();
        String totalShip=totalShipping.getText();
        String total=totalPrice.getText();

        totalPr=totalPr.replace("$","");
        totalShip=totalShip.replace("$","");
        total=total.replace("$","");

        double totalprice=Double.parseDouble(totalPr);
        double totalshipping=Double.parseDouble(totalShip);

        double Total=Double.parseDouble(total);

        double allTotal=totalprice+totalshipping;

        Assert.assertEquals(Total,allTotal);




    }




}
