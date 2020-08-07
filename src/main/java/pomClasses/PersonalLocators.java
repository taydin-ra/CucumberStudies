package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;
import java.util.Set;

public class PersonalLocators extends BasePom {
    /*
    PageFactory extension of page object model
    PageFactory.initElements(driver, this) hangi driveri kullanmasi gerektigini belirtiyoruz.
    Constructor her seyden once execute yaptigi icin constructorda tanimliyoruz


     */

    private WebDriver driver;

    public PersonalLocators() {
        driver = BaseDriver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='My personal information']")
    private WebElement myPersonalInfoTab;

    public void clickPersonalInfoTab() {
        clickOnFunctionalities(myPersonalInfoTab);

    }

    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstname;

    public void enteringFirstName(String name){
        firstname.clear();
        sendKeysFunction(firstname,name);
    }

    @FindBy(css="input[name='old_passwd")
    private WebElement currentPassword;

    public void typeTheCurrentPassword(String password){
        sendKeysFunction(currentPassword,password);

    }


    @FindBy(css="input#passwd")
    private WebElement newPassword;

    public void typeTheNewPassword(String newPasswordd){
        sendKeysFunction(newPassword,newPasswordd);

    }
    @FindBy(css="input#confirmation")
    private WebElement confirmPassword;

    public void typeTheConfirmPassword(String newPassword){
        sendKeysFunction(confirmPassword,newPassword);

    }
    @FindBy(css="button[name='submitIdentity']")
    private WebElement saveButton;

    public void clickSaveButton(){
        clickOnFunctionalities(saveButton);
    }

    @FindBy(xpath = "(//a[contains(text(),'Sign out')])[1]")
    private WebElement signOut;

    public void clickOnSignOut(){
        clickOnFunctionalities(signOut);
    }
}
