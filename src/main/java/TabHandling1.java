import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TabHandling1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement catDropDown = driver.findElement(By.id("searchDropdownBox"));
        catDropDown.click();
        UtilityClass.waitFor(2000);

        List<WebElement> allOptions = driver.findElements(By.tagName("option"));
        for(WebElement e : allOptions){
            if(e.getText().equals("Computers")){
                e.click();
            }
        }
        UtilityClass.waitFor(2000);
        WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();
        UtilityClass.waitFor(2000);

        //Open 1st item in new tab...
        WebElement firstItem = driver.findElement(By.xpath("(//img[@alt='Amazon Basics Micro SDXC Memory Card with Full Size Adapter, A2, U3, Read Speed up to 100 MB/s, 128 GB, Black'])[1]"));
        Actions act = new Actions(driver);
        Action a1 = act.keyDown(Keys.CONTROL)
                .click(firstItem)
                .keyUp(Keys.CONTROL)
                .build();
        a1.perform();

        //Open 2nd item in new tab...
        WebElement secondItem = driver.findElement(By.xpath("//img[@alt='Samsung Galaxy Tab A9+ Tablet 11” 64GB Android Tablet, Big Screen, Quad Speakers, Upgraded Chipset, Multi Window Display, Slim, Light, Durable Design, US Version, 2024, Graphite']"));
        Action a2 = act.keyDown(Keys.CONTROL)
                .click(secondItem)
                .keyUp(Keys.CONTROL)
                .build();
        a2.perform();

        //Open 3rd item in new tab...
        WebElement thirdItem = driver.findElement(By.xpath("//img[@alt='TP-Link AC1200 WiFi Extender, 2025 Wirecutter Best WiFi Extender, 1.2Gbps Home Signal Booster, Dual Band 5GHz/2.4GHz, Up to 1600 Sq.ft and 32 Devices, EasyMesh Compatible, One Ethernet Port (RE315)']"));
        Action a3 = act.keyDown(Keys.CONTROL)
                .click(thirdItem)
                .keyUp(Keys.CONTROL)
                .build();
        a3.perform();

        //Get all tabs window ids...
        Set<String> allTabs = driver.getWindowHandles();
        ArrayList<String> tabsList = new ArrayList<>(allTabs);
        String parentWin = tabsList.get(0);

        for (int i = 1; i < tabsList.size(); i++) {
            driver.switchTo().window(tabsList.get(i));
            UtilityClass.waitFor(4000);
            WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
            UtilityClass.waitFor(4000);
            addToCart.click();
            UtilityClass.waitFor(4000);
            driver.close();
            UtilityClass.waitFor(2000);
        }
        driver.switchTo().window(parentWin);
        driver.navigate().refresh();
        UtilityClass.waitFor(2000);
        WebElement cardLogo = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        cardLogo.click();
        UtilityClass.waitFor(3000);
        WebElement proceedToCheckBtn = driver.findElement(By.name("proceedToRetailCheckout"));
        proceedToCheckBtn.click();

        UtilityClass.waitFor(6000);
        driver.quit();
    }
}
