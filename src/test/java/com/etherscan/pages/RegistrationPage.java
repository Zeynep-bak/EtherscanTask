package com.etherscan.pages;

import com.etherscan.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage{

    public RegistrationPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//*[contains(text(),'ContentPlaceHolder1_txtPassword')]")
    public WebElement errormessage;


    public void clickTo(String error) {
        Driver.get().findElement(By.xpath("//*[contains(text(),'" + error + "')]")).click();
    }

   public String getMessage(String message){
         String actualMsg= Driver.get().findElement(By.xpath("//*[contains(text(),'"+message+"')]")).getText();
        return message;
   }
}
