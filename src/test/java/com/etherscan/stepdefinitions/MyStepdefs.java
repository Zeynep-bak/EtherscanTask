package com.etherscan.stepdefinitions;

import com.etherscan.utility.ConfigurationReader;
import com.etherscan.utility.Driver;
import io.cucumber.java.en.Given;

public class MyStepdefs {
    @Given("the user on the registration page")
    public void theUserOnTheRegistrationPage() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }
}
