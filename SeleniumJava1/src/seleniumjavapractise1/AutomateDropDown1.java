package seleniumjavapractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateDropDown1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        UtilityClass.waitFor(5000);

        WebElement dd = driver.findElement(By.id("searchDropdownBox"));
        Select s1 = new Select(dd);
//        s1.selectByValue("search-alias=baby-products-intl-ship");
//        s1.selectByIndex(4);
        s1.selectByVisibleText("Books");
        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
