package com.etherscan.stepdefinitions;

import com.etherscan.utilities.ConfigurationReader;
import com.etherscan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registrationStepDefs {

    @Given("the user on the registration page")
    public void the_user_on_the_registration_page() {
       String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters {string} {string} {string} {string}")
    public void the_user_enters(String string, String string2, String string3, String string4) {

    }

    @When("the user clicks to {string}")
    public void the_user_clicks_to(String string) {

    }

    @Then("\"Your account has been successfully registered and pending for email verification.\"message appear")
    public void your_account_has_been_successfully_registered_and_pending_for_email_verification_message_appear() {

    }

    @Then("{string} message should appeare")
    public void messageShouldAppeare(String arg0) {
    }
}
