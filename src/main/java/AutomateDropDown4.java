import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDropDown4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        seleniumjavapractise1.UtilityClass.waitFor(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('searchDropdownBox').value='search-alias=audible';");

        seleniumjavapractise1.UtilityClass.waitFor(2000);
        driver.quit();
    }
}
