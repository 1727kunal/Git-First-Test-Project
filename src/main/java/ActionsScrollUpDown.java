import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollUpDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        UtilityClass.waitFor(5000);
        WebElement targetElement = driver.findElement(By.linkText("About Amazon"));
        Point p = targetElement.getLocation();
        int yPos = p.getY()-200;

        UtilityClass.waitFor(5000);
        Actions act = new Actions(driver);
//        act.scrollToElement(targetElement).perform();
        act.scrollByAmount(0,yPos).perform();   //Scrolling down
        UtilityClass.waitFor(5000);
        act.scrollByAmount(0,-yPos).perform();  //Scrolling up

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
