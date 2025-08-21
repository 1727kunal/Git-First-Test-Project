import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RobotScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(2000);

        try {
            Robot r1 = new Robot();
            Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r1.createScreenCapture(rect);
            String name = "Robot-Screenshot-"+UtilityClass.getCurrentDateTime2();
            ImageIO.write(img,"png", new File("C:\\Users\\admin\\IdeaProjects\\GitProjectFirst\\Screenshots\\"+name+".png"));
        } catch (AWTException | IOException e) {
            throw new RuntimeException(e);
        }

        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
