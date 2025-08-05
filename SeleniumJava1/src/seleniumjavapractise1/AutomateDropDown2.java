package seleniumjavapractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDropDown2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        UtilityClass.waitFor(5000);

        WebElement dd = driver.findElement(By.id("searchDropdownBox"));
        dd.click();
        UtilityClass.waitFor(1000);
        dd.sendKeys(Keys.ARROW_DOWN);
        UtilityClass.waitFor(1000);
        dd.sendKeys(Keys.ARROW_DOWN);
        UtilityClass.waitFor(1000);
        dd.sendKeys(Keys.ARROW_DOWN);
        UtilityClass.waitFor(1000);
        dd.sendKeys(Keys.ENTER);

        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
