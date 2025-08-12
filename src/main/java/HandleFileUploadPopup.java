import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFileUploadPopup {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        UtilityClass.waitFor(5000);
        WebElement chooseBtn = driver.findElement(By.id("file-upload"));
        chooseBtn.sendKeys("D:\\Kunal\\Wallpapers\\PC\\Kai.jpg");
        UtilityClass.waitFor(5000);
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();
        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
