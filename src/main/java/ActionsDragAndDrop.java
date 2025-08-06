import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();

        //Scroll the page to go to desired position...
        UtilityClass.waitFor(2000);
        Actions act = new Actions(driver);
        act.scrollByAmount(0,200).perform();

        //Switch to frame...
        UtilityClass.waitFor(2000);
        WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
        driver.switchTo().frame(frame);

        //Perform drag and drop...
        UtilityClass.waitFor(2000);
        WebElement draggable = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
        WebElement droppable = driver.findElement(By.id("trash"));
        act.dragAndDrop(draggable,droppable).perform();

        //Switch back to default window...
        UtilityClass.waitFor(5000);
        driver.switchTo().defaultContent();

        UtilityClass.waitFor(3000);
        driver.quit();
    }
}
