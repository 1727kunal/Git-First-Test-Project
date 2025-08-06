import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpDownJSExe {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        UtilityClass.waitFor(1000);
        WebElement targetElement = driver.findElement(By.linkText("About Amazon"));
        Point p = targetElement.getLocation();
        int yPos = p.getY()-200;

        UtilityClass.waitFor(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+yPos+")");
        UtilityClass.waitFor(2000);
        js.executeScript("window.scrollBy(0,"+(-yPos)+")");

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
