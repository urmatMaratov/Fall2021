package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDemoSteps {

    @Given("User is logged in to https:\\/\\/www.facebook.com\\/")
    public void user_is_logged_in_to_https_www_facebook_com() {
        System.out.println("User is on FaceBook.com");
        
        
    }
    @When("User enter test@test.com to email field")
    public void user_enter_test_test_com_to_email_field() {
        System.out.println("User entered Hello123 to password input");
        
        
    }
    @When("User should enter Hello1234 in password input field")
    public void user_should_enter_hello1234_in_password_input_field() {
        System.out.println();
        
        
    }
    @When("User should click on Log In button")
    public void user_should_click_on_log_in_button() {


            
    }
    @Then("User should successfully logged in to the Facebook")
    public void user_should_successfully_logged_in_to_the_facebook() {


    }

    @When("User enter test123.com to email field")
    public void user_enter_test123_com_to_email_field() {
       
        
    }
    @When("User should enter Hello12345 in password input field")
    public void user_should_enter_hello12345_in_password_input_field() {
       
        
    }
    @Then("User should not be able to log in to the Facebook")
    public void user_should_not_be_able_to_log_in_to_the_facebook() {
       
        
    }






}
