package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/BlankUser/Documents/Selenium Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
}

