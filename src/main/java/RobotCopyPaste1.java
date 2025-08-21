/*
Performing the copy-paste operation using Robot class with keyPress and keyRelease method...
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotCopyPaste1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://text-compare.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(3000);

        Actions act = new Actions(driver);
        act.scrollByAmount(0,200).perform();
        UtilityClass.waitFor(1000);

        WebElement textarea1 = driver.findElement(By.id("inputText1"));
        WebElement textarea2 = driver.findElement(By.id("inputText2"));
        textarea1.sendKeys("Kunal Waghamare");
        UtilityClass.waitFor(1000);

        try {
            Robot r1 = new Robot();
            r1.keyPress(KeyEvent.VK_CONTROL);
            r1.keyPress(KeyEvent.VK_A);
            r1.keyRelease(KeyEvent.VK_CONTROL);
            UtilityClass.waitFor(1000);

            r1.keyPress(KeyEvent.VK_CONTROL);
            r1.keyPress(KeyEvent.VK_C);
            r1.keyRelease(KeyEvent.VK_CONTROL);
            UtilityClass.waitFor(1000);

            textarea2.click();
            r1.keyPress(KeyEvent.VK_CONTROL);
            r1.keyPress(KeyEvent.VK_V);
            r1.keyRelease(KeyEvent.VK_CONTROL);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
