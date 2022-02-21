
package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {



    @Given("User is logged in to https:\\/\\/www.lalafo.kg\\/")
    public void user_is_logged_in_to_https_www_lalafo_kg() {
        System.out.println("user in lalafo");
    }
    @When("User enter word to searching field")
    public void user_enter_word_to_searching_field() {
        System.out.println("Entering the word to search field");
       
    }
    @When("User clicks the search button")
    public void user_clicks_the_search_button() {
        System.out.println("Clicking the button");
       
    }
    @Then("User successfully find item")
    public void user_successfully_find_item() {
        System.out.println("You did it");
       
    }

    @When("User enters {string} to searching field")
    public void user_enters_to_searching_field(String string) {
        System.out.println("User in lalafo");
    }
    @Then("User successfully find {string}")
    public void user_successfully_find(String string) {
        System.out.println("user successfully logged in");
    }


}
