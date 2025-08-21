import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


/*
Performing the copy-paste operation using Robot class with browser's copy and paste option...
*/

public class RobotCopyPaste2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.diffchecker.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(5000);

        WebElement closeBtn = driver.findElement(By.xpath("//button[@aria-label='Close modal']"));
        closeBtn.click();

        WebElement textArea1 = driver.findElement(By.xpath("//div[@aria-label='Original text input']"));
        WebElement textArea2 = driver.findElement(By.xpath("//div[@aria-label='Changed text input']"));

        UtilityClass.waitFor(2000);
        textArea1.sendKeys("Kunal@H@1727");
        UtilityClass.waitFor(1000);
        try {
            Robot r1 = new Robot();
            r1.keyPress(KeyEvent.VK_CONTROL);
            r1.keyPress(KeyEvent.VK_A);
            r1.keyRelease(KeyEvent.VK_CONTROL);
            UtilityClass.waitFor(2000);

            r1.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            r1.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            UtilityClass.waitFor(2000);

            r1.keyPress(KeyEvent.VK_DOWN);
            UtilityClass.waitFor(2000);
            r1.keyPress(KeyEvent.VK_DOWN);
            UtilityClass.waitFor(2000);
            r1.keyPress(KeyEvent.VK_DOWN);
            UtilityClass.waitFor(2000);
            r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            UtilityClass.waitFor(2000);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
