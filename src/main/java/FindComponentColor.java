import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindComponentColor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://en-gb.facebook.com/");
        driver.manage().window().maximize();

        WebElement loginBtn = driver.findElement(By.name("login"));
        String color = loginBtn.getCssValue("background-color");
        System.out.println("Login button color = "+color);

        Dimension d = loginBtn.getSize();
        int height = d.getHeight();
        int width = d.getWidth();
        System.out.println("Login button height = " +height);
        System.out.println("Login button width = " +width);

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
