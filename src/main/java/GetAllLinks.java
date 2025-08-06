import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int count = allLinks.size();
        System.out.println("Total number of links = " +count);

        for (int i = 0; i < count; i++) {
            String linkText = allLinks.get(i).getText();
            System.out.println("URL " +(i+1)+ " Text: " +linkText);

            String linkURL = allLinks.get(i).getAttribute("href");
            System.out.println("URL " +(i+1)+ ": " +linkURL);
        }

        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
