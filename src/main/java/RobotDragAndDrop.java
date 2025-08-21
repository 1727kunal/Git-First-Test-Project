import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.InputEvent;

public class RobotDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(2000);

        try {
            Robot r1 = new Robot();
            r1.mouseWheel(1);

            WebElement frame1 = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
            driver.switchTo().frame(frame1);
            UtilityClass.waitFor(2000);

            WebElement draggable = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
            WebElement droppable = driver.findElement(By.id("trash"));

            Point source = draggable.getLocation();
            Point destination = droppable.getLocation();

            // iframe position relative to browser viewport
            Point iframePos = frame1.getLocation();

            // browser position on screen
            Point browserPos = driver.manage().window().getPosition();

            // calculate absolute screen coordinates
            int adjustX = 50;   // adjust for browser borders
            int adjustY = 120;  // adjust for browser top bar & URL bar

            int sourceX = browserPos.getX() + iframePos.getX() + source.getX() + adjustX;
            int sourceY = browserPos.getY() + iframePos.getY() + source.getY() + adjustY;

            int destinationX = browserPos.getX() + iframePos.getX() + destination.getX() + adjustX;
            int destinationY = browserPos.getY() + iframePos.getY() + destination.getY() + adjustY;

            r1.mouseMove(sourceX, sourceY);
            UtilityClass.waitFor(1000);
            r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            UtilityClass.waitFor(1000);
            r1.mouseMove(destinationX, destinationY);
            UtilityClass.waitFor(1000);
            r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            UtilityClass.waitFor(1000);
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        UtilityClass.waitFor(4000);
        driver.quit();
    }
}
