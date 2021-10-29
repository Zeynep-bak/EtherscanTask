package com.etherscan.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etherscan {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.get("https://etherscan.io/register");
        driver.manage().window().maximize();

        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(driver.getTitle().contains("Etherscan Registration Page"));
        Thread.sleep(3000);

        WebElement fillname= driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtUserName"));
        fillname.sendKeys("Zeynep");

        WebElement fillemail = driver.findElement(By.cssSelector("input[aria-label=\"Email address\"]"));
        fillemail.sendKeys("zyn@gmail.com");

        WebElement loginbtn = driver.findElement(By.cssSelector("a[href='login']"));
        loginbtn.click();

        driver.quit();

    }
}
