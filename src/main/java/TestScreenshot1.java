import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestScreenshot1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(5000);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        //1st way creating a screenshot with date and time
        //String fileName = "Screenshot-"+UtilityClass.getCurrentDateTime1();

        //2nd way of creating a screenshot with date and time
        String fileName = "Screenshot-" + UtilityClass.getCurrentDateTime2();
        File destination = new File("C:\\Users\\admin\\IdeaProjects\\GitProjectFirst\\Screenshots\\"+fileName+".png");

        try {
            FileHandler.copy(source,destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
