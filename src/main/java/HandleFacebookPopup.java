/*
 * The notification pop-up after login to Facebook website can not be handled using Alert class in selenium
 * So we need make use of ChromeOptions class to disable that pop-up
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFacebookPopup {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notification");

        WebDriver driver = new ChromeDriver(opt);
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(5000);

        UtilityClass.waitFor(2000);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("7264811720");
        UtilityClass.waitFor(2000);

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("1163harsha1727");
        UtilityClass.waitFor(2000);

        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();

        UtilityClass.waitFor(30000);
        driver.quit();
    }
}
