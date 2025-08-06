import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        WebElement e1 = driver.findElement(By.xpath("//div[text()='EN']"));
        Actions act = new Actions(driver);
        act.moveToElement(e1).perform();
        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
