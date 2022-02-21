package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
    @Given("user is on FaceBook")
    public void user_is_on_face_book() {
        System.out.println("chjgsdfjhsdgjhfsdg");

    }
    @When("user enters {string}")
    public void user_enters(String string) {
        System.out.println("sdhkjvbsdjhklvb");

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("djvbsdjvnsdjkvn");

    }
    @Then("user should see {string}")
    public void user_should_see(String string) {
        System.out.println("hdfjhsgdkjsdgk");

    }


}
