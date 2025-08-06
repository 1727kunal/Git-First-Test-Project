import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        UtilityClass.waitFor(1000);

        WebElement e1 = driver.findElement(By.id("doubleClickBtn"));
        UtilityClass.waitFor(1000);

        Actions act = new Actions(driver);
        act.scrollByAmount(0,300).perform();

        UtilityClass.waitFor(1000);
        act.doubleClick(e1).perform();

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
