package com.etherscan.pages;

import com.etherscan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtUserName")
    public WebElement usernameField;

    @FindBy(css = "input[aria-label=\"Email address\"]")
    public WebElement emailField;

    @FindBy(css = "input[id='ContentPlaceHolder1_txtPassword']")
    public WebElement passwordbox;

    @FindBy(css = "input[id='ContentPlaceHolder1_txtPassword2']")
    public WebElement confirmpasswrdbox;

    @FindBy(xpath = "//*[text()='I agree to the ']")
    public WebElement agreebox;

    @FindBy(xpath = "//*[text()='I agree to receive the Etherscan newsletter and understand that I can ")
    public WebElement agreebox2;

    @FindBy(id = "ContentPlaceHolder1_btnRegister")
    public WebElement createAccountbox;

    @FindBy(css = "a[href='login']")
    public WebElement alreadyAccount;






}
