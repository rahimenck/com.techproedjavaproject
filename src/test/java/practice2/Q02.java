package practice2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q02 extends TestBase {
       /*
    Given
        Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    When
        Click on the "Animals and Nature" emoji
    And
        Click all the "Animals and Nature"  emoji elements
    And
        Fill the form
    And
        Press the apply button
    Then
        Verify "code" element is displayed
     */

    @Test
    public void test(){
        //Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        //First switch into iframe
        WebElement emojisIframe = driver.findElement(By.id("emoojis"));
        driver.switchTo().frame(emojisIframe);

        //Click on the "Animals and Nature" emoji
        driver.findElement(By.xpath("(//span[@data-upgraded=',MaterialRipple'])[2]")).click();







    }






}
