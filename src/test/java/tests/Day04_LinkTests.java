package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_LinkTests {
    WebDriver driver;

    @Before
    public void setUP(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
    /*
    Linktext and partiallinktext are case sensitive
     */

    @Test
    public void LMSPage(){
      driver.get("https://techproeducation.com/");
      //click on LMS login
      driver.findElement(By.linkText("LMS LOGIN")).click();
      //verify lms page is visible
        String expectedURL = "https://lms.techproeducation.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("LMS LOGIN PAGE IS NOT DISPLAYED", expectedURL, actualURL);


    }

    @Test
    public void LMSPagePartialLinkText(){
        driver.get("https://techproeducation.com/");
        driver.findElement(By.partialLinkText("LMS LO")).click();
         //ALTERNATIVELY WE CAN LOCATE A CORE ELEMENT ON LMS PAGE AND CHECK IF THAT ELEMENT IS DISPLAYED IN THE PAGE
        WebElement loginElement = driver.findElement(By.linkText("Login/Register"));
        Assert.assertTrue(loginElement.isDisplayed());//isDisplayed() returns TRUE is element is on the page. returns false if element is not displayed on the page
        //Assert.assertTrue(driver.findElement(By.linkText("Login/Register")).isDisplayed());




    }


    @After
    public void tearDown(){
        driver.quit();
}
    }


