package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pomClasses.BasePom;
import pomClasses.PersonalLocators;

import java.util.prefs.BackingStoreException;

public class PersonalSteps extends BasePom {
    PersonalLocators pl = new PersonalLocators();

    @Given("^Click on my personal information tab$")
    public void click_on_my_personal_information_tab() throws Throwable {
        pl.clickPersonalInfoTab();


    }

    @Given("^Clear the old name and type the \"([^\"]*)\"$")
    public void clear_the_old_name_and_type_the(String newName) throws Throwable {
        pl.enteringFirstName(newName);

    }

    @Given("^Type the current \"([^\"]*)\"$")
    public void type_the_current(String password) throws Throwable {
        pl.typeTheCurrentPassword(password);

    }

    @Given("^Type the \"([^\"]*)\"$")
    public void type_the(String newPassword) throws Throwable {
        pl.typeTheNewPassword(newPassword);

    }
    @Given("^Confirm the \"([^\"]*)\"$")
    public void confirm_the(String confirm) throws Throwable {
        pl.typeTheConfirmPassword(confirm);

    }

    @Given("^Click on the Save Button$")
    public void click_on_the_Save_Button() throws Throwable {
        pl.clickSaveButton();

    }
    @When("^Click on Sign Out tab$")
    public void click_on_Sign_Out_tab() throws Throwable {
        pl.clickOnSignOut();

    }


}
