import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class WindowHandling1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.naukri.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(2000);

        WebElement logBtn = driver.findElement(By.linkText("Login"));
        logBtn.click();
        UtilityClass.waitFor(2000);
        WebElement googleBtn = driver.findElement(By.xpath("//div[@class='google']"));
        googleBtn.click();

        //Handling multiple windows...
        Set<String> allWindows =  driver.getWindowHandles();
        Iterator<String> itr = allWindows.iterator();
        String parent  = itr.next();
        String child = itr.next();
        System.out.println(parent);
        System.out.println(child);

        driver.switchTo().window(child);
        UtilityClass.waitFor(3000);
        System.out.println(driver.getTitle());
        performGoogleLogin(driver);
        UtilityClass.waitFor(2000);
        driver.switchTo().defaultContent();

        UtilityClass.waitFor(5000);
        driver.quit();
    }

    public static void performGoogleLogin(WebDriver driver){
            WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
            email.sendKeys("kunalwaghamare1163@gmail.com");
            UtilityClass.waitFor(2000);
            WebElement nextBtn1 = driver.findElement(By.xpath("//span[text()='Next']"));
            nextBtn1.click();
            UtilityClass.waitFor(2000);

            // Below code won't work as per Google's privacy. They don't allow to automate...
            WebElement pass = driver.findElement(By.name("Passwd"));
            pass.sendKeys("1163harsha1727");
            UtilityClass.waitFor(2000);
            WebElement nextBtn2 = driver.findElement(By.xpath("//span[text()='Next']"));
            nextBtn2.click();
            UtilityClass.waitFor(2000);

            driver.close();
    }
}
