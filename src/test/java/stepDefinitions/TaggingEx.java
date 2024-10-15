package stepDefinitions;

import io.cucumber.java.en.When;

public class TaggingEx {


    @When("This is a valid login test")
    public void this_is_a_valid_login_test() {
       System.out.println("login test verified");
    }
    @When("This is a search test")
    public void this_is_a_search_test() {
        System.out.println("search working");
    }
        @When("This is an Image search")
        public void this_is_an_image_search() {
            System.out.println("image search working");
        }
    @When("This is a Mic test")
    public void this_is_a_mic_test() {
        System.out.println("mic test done");
    }

    @When("This is a Logout test")
    public void this_is_a_logout_test() {
        System.out.println("logout test verified");
    }

}
