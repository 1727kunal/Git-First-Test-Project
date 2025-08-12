import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoCSSSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        UtilityClass.waitFor(2000);
        //CSS Selector using ID(#) as parameter...
        //WebElement searchField = driver.findElement(By.cssSelector("#APjFqb"));
        //searchField.sendKeys("INDIA");

        //CSS Selector using CLASS(.) as parameter...
        //WebElement searchField = driver.findElement(By.cssSelector(".gLFyf"));
        //searchField.sendKeys("AUSTRALIA");

        //CSS Selector using TAGNAME.CLASS as parameter...
        //WebElement searchField = driver.findElement(By.cssSelector("textarea.gLFyf"));
        //searchField.sendKeys("FRANCE");

        //CSS Selector using TAGNAME[ATNAME = 'ATVALUE'] as parameter...
//        WebElement searchField = driver.findElement(By.cssSelector("textarea[name='q']"));
//        searchField.sendKeys("ENGLAND");

        //CSS Selector using TAGNAME.CLASS[ATNAME = 'ATVALUE'] as parameter...
//        WebElement searchField = driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
//        searchField.sendKeys("ITALY");

        //CSS Selector using CARET(^) symbol as parameter...
        WebElement searchField = driver.findElement(By.cssSelector("textarea[data-ved^='0ahUKE']"));
        searchField.sendKeys("NEW ZEALAND");

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
