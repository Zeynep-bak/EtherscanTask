package com.etherscan.pages;

import com.etherscan.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//*[contains(text(),'Terms and Conditions')]")
    public WebElement checkbox;

    @FindBy(id = "ContentPlaceHolder1_btnRegister")
    public WebElement createAccountbox;

    @FindBy(css = "a[href='login']")
    public WebElement alreadyAccount;



    public void login(String userNameStr, String passwordStr,String  email, String cnfrmpasword) {
        usernameField.sendKeys(userNameStr);
        passwordbox.sendKeys(passwordStr);
        emailField.sendKeys(email);
        confirmpasswrdbox.sendKeys(cnfrmpasword);
    }

        public void clickTo(String box){
        Driver.get().findElement(By.xpath("//*[contains(text(),'"+box+"')]")).click();




    }



}
