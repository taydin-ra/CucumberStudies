package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class BuyItemLocators extends BasePom {
    private WebDriver driver;

    public BuyItemLocators(){
        driver= BaseDriver.getDriver();
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "(//a[@title='Dresses'])[2]")

    private WebElement dressesTab;

    public void ClickOnDresses(){
        clickOnFunctionalities(dressesTab);
    }

    @FindBy(xpath = "//li//div//a//img[@title='Printed Chiffon Dress']")

    private WebElement printedDress;

    public void ClickOnPrintedDresses(){
        ScrollDown(printedDress);
        clickOnFunctionalities(printedDress);
    }


}
