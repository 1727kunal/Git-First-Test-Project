/*
 * In this class we are going to handle the auto-suggestion for Flipkart website...
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class HandleAutoSuggestion2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        UtilityClass.waitFor(1000);
        WebElement searchField = driver.findElement(By.name("q"));
        UtilityClass.waitFor(1000);
        searchField.sendKeys("Fossil watch");
        UtilityClass.waitFor(5000);

        List<WebElement> suggestionOptions = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/ul/li"));
        UtilityClass.waitFor(2000);
        System.out.println(suggestionOptions.size());
        suggestionOptions.get(6).click();

        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
