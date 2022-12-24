package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

    public static void main(String[] args) {
        //1/set up

        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");

        //2.create
        WebDriver driver = new ChromeDriver();

        //3.maximize the window
        driver.manage().window().maximize();

        driver.get("https://www.walmart.com/");

        // driver.get("https://amazon.com/");

        driver.navigate().to("https://amazon.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        //driver.close();
        driver.quit(); //stronger


    }





}
