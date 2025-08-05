

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutomateDropDown3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        UtilityClass.waitFor(5000);

        List<WebElement> allOptions = driver.findElements(By.xpath("//select/option"));
        for(WebElement e : allOptions){
           if(e.getText().equals("Books")){
               e.click();
           }
        }

       UtilityClass.waitFor(5000);
        driver.quit();
    }
}
