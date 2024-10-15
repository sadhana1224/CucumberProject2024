package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDefinition {

    @Before
    public void setup()
    {
        System.out.println("Intitialize the webdriver");
        System.out.println("open the browser");
        System.out.println("launch the URL");
    }
    @Given("user is on add page")
    public void user_is_on_add_page() {

        System.out.println("user page");
    }
    @When("user fills all the details")
    public void user_fills_all_the_details() {
        System.out.println("user filled the details");

    }
    @Then("user is added in the account")
    public void user_is_added_in_the_account() {
        System.out.println("user added");
    }


    @Given("User i son edit page")
    public void user_i_son_edit_page() {
        System.out.println("Edit page");

    }
    @When("user edit all the necessary details")
    public void user_edit_all_the_necessary_details() {
        System.out.println("update the details");

    }
    @Then("user details updated")
    public void user_details_updated() {
        System.out.println("Updated");
    }

    @Given("user is on Delete page")
    public void user_is_on_delete_page() {
        System.out.println("Delete page");

    }
    @When("user enter the confirmation")
    public void user_enter_the_confirmation() {
        System.out.println("enter the confirmation");

    }
    @Then("user gets deleted")
    public void user_gets_deleted() {
        System.out.println("user deleted");
    }
@After
    public void teardown()
{
    System.out.println("Close the browser");
}



}
