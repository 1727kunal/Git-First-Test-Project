/*
 * In this class we are going to handle the auto-suggestion for Myntra website...
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HandleAutoSuggestion3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.myntra.com/");
        driver.manage().window().maximize();

        UtilityClass.waitFor(2000);
        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
        searchField.sendKeys("Jacket");
        UtilityClass.waitFor(5000);
        List<WebElement> suggestionOptions = driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
        suggestionOptions.get(10).click();

        UtilityClass.waitFor(5000);
        driver.quit();
    }
}
