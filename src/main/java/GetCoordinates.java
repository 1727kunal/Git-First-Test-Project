import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetCoordinates {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        UtilityClass.waitFor(5000);
        WebElement targetElement = driver.findElement(By.linkText("About Amazon"));
        Point p = targetElement.getLocation();
        int xPos = p.getX();
        int yPos = p.getY();

        System.out.println(xPos);
        System.out.println(yPos);

        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
