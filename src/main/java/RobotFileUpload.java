import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotFileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(3000);

        WebElement uploadBtn = driver.findElement(By.id("file_wraper0"));
        uploadBtn.click();
        UtilityClass.waitFor(2000);

        String filePath = "D:\\Kunal\\Wallpapers\\PC\\Kai.jpg";
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        UtilityClass.waitFor(2000);

        Robot r1 = null;
        try {
            r1 = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        r1.keyPress(KeyEvent.VK_CONTROL);
        UtilityClass.waitFor(500);
        r1.keyPress(KeyEvent.VK_V);
        UtilityClass.waitFor(500);
        r1.keyRelease(KeyEvent.VK_V);
        UtilityClass.waitFor(500);
        r1.keyRelease(KeyEvent.VK_CONTROL);
        UtilityClass.waitFor(500);
        r1.keyPress(KeyEvent.VK_ENTER);
        UtilityClass.waitFor(500);
        r1.keyRelease(KeyEvent.VK_ENTER);
        UtilityClass.waitFor(1000);

        WebElement submitBtn = driver.findElement(By.id("submitbutton"));
        submitBtn.click();

        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
