import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlerts {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        UtilityClass.waitFor(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300);");
        UtilityClass.waitFor(1000);

        WebElement clickMe = driver.findElement(By.id("confirmButton"));
        clickMe.click();
        UtilityClass.waitFor(1000);
        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
        UtilityClass.waitFor(1000);

        WebElement clickMe2 = driver.findElement(By.id("promtButton"));
        clickMe2.click();
        Alert a1 = driver.switchTo().alert();
        UtilityClass.waitFor(5000);
        a1.sendKeys("John");
        a1.accept();

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
