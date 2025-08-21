import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotRightClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(5000);

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        Actions act = new Actions(driver);
        act.contextClick(gmailLink).perform();
        UtilityClass.waitFor(2000);
        try {
            Robot r1 = new Robot();
            r1.keyPress(KeyEvent.VK_DOWN);
            UtilityClass.waitFor(1000);

            r1.keyPress(KeyEvent.VK_DOWN);
            UtilityClass.waitFor(1000);

            r1.keyPress(KeyEvent.VK_DOWN);
            UtilityClass.waitFor(1000);

            r1.keyPress(KeyEvent.VK_ENTER);
            UtilityClass.waitFor(2000);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
