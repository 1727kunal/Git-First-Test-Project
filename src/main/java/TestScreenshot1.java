import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TestScreenshot1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(5000);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destionaion = new File("C:\\Users\\admin\\IdeaProjects\\GitProjectFirst\\Screenshots\\first.png");
        try {
            FileHandler.copy(source,destionaion);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
