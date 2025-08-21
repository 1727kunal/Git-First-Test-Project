/*
* Performing the copy and paste operation using Actions Class...
*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsCopyPaste {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://text-compare.com/");
        driver.manage().window().maximize();
        UtilityClass.waitFor(3000);

        WebElement textarea1 = driver.findElement(By.id("inputText1"));
        textarea1.sendKeys("Kunal Waghamare");
        UtilityClass.waitFor(1000);

        Actions act = new Actions(driver);
        Action a1 = act
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .build();
        a1.perform();
        UtilityClass.waitFor(1000);

        Action a2 = act
                .keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        a2.perform();
        UtilityClass.waitFor(1000);

        WebElement textarea2 = driver.findElement(By.id("inputText2"));
        Action a3 = act
                .keyDown(textarea2,Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .build();
        a3.perform();


        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
