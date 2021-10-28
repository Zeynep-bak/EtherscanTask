package com.etherscan.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etherscan {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.get("https://etherscan.io/register");
    }
}
