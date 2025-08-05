import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");
//        UtilityClass.waitFor(3000);
//        driver.navigate().refresh();
        driver.manage().window().maximize();
//        System.out.println(driver.manage().window().getSize());
        seleniumjavapractise1.UtilityClass.waitFor(3000);
        driver.quit();
    }
}
