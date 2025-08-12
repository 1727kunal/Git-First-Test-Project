/*
 * In this class we are going to handle the auto-suggestion for Amazon website...
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class HandleAutoSuggestion1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        UtilityClass.waitFor(2000);
        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
        searchField.sendKeys("iPhone 16");
        UtilityClass.waitFor(2000);

        List<WebElement> suggestionOptions = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
        UtilityClass.waitFor(2000);
        suggestionOptions.get(9).click();

        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
