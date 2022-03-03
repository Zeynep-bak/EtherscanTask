package com.etherscan.stepdefinitions;

import com.etherscan.pages.BasePage;
import com.etherscan.pages.RegistrationPage;
import com.etherscan.utilities.BrowserUtils;
import com.etherscan.utilities.ConfigurationReader;
import com.etherscan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class registrationStepDefs {

    @Given("the user on the registration page")
    public void the_user_on_the_registration_page() {
       String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters {string} {string} {string} {string}")
    public void the_user_enters(String username, String password, String email, String confirmpaswrd) {
      new RegistrationPage().login(username,password,email,confirmpaswrd);
    }

    @When("the user clicks to {string}")
    public void the_user_clicks_to(String checkbox) {
        BrowserUtils.waitFor(1);
    new RegistrationPage().clickTo(checkbox);

    }

    @Then("{string}message appear")
    public void messageAppear(String module) {
    }

    @Then("{string} message should appeare")
    public void messageShouldAppeare(String message) {
    }
}
