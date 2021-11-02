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
    //public void clickBtn(String btnName){
        //
        //        Driver.get().findElement(By.id(""+btnName+"")).click();
        //
        //
        //    }
    }

    @Then("\"Your account has been successfully registered and pending for email verification.\"message appear")
    public void your_account_has_been_successfully_registered_and_pending_for_email_verification_message_appear() {

    }

    @Then("{string} message should appeare")
    public void messageShouldAppeare(String expected) {

     String actualmes= new RegistrationPage().errormessage.getText();
        System.out.println(actualmes);
        //Assert.assertEquals(expected,actualmes);

    }
    @When("the user clicks to {string} Terms and Conditions")
    public void the_user_clicks_to_Terms_and_Conditions(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks to {string} Etherscan newsletter")
    public void the_user_clicks_to_Etherscan_newsletter(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
