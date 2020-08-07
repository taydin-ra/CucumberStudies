package stepDefinition;

import cucumber.api.java.en.Given;
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

    @Given("^Clear the old last name and type the \"([^\"]*)\"$")
    public void clear_the_old_last_name_and_type_the(String arg1) throws Throwable {

    }

    @Given("^Type the \"([^\"]*)\"$")
    public void type_the(String arg1) throws Throwable {


    }

    @Given("^Type the current \"([^\"]*)\"$")
    public void type_the_current(String arg1) throws Throwable {

    }

}
