package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_WebDriverManager {

    public static void main(String[] args) {
    //    System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");
    //no need to use system property. we can use webdrivermanager
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com/");

        driver.quit();
    }
}
