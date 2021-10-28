package com.etherscan.pages;

import com.etherscan.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "ctl00$ContentPlaceHolder1$txtUserName")
    public WebElement usernameField;

    @FindBy(css = "input[aria-label=\"Email address\"]")
    public WebElement emailField;

    @FindBy(css = ".recaptcha-checkbox.goog-inline-block.recaptcha-checkbox-unchecked.rc-anchor-checkbox")
    public WebElement NoRobotBox;


}
