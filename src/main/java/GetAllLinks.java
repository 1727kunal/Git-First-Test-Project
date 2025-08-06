import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GetAllLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        Set<WebElement> uniqueLinks = new HashSet<>(allLinks);

        int count = uniqueLinks.size();
        System.out.println("Total number of links present on Google page = "+count);

//        for(WebElement e : uniqueLinks){
//            System.out.println(e.getAttribute("href"));
//        }

        Iterator<WebElement> itr = uniqueLinks.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getAttribute("href"));
        }

        UtilityClass.waitFor(2000);
        driver.quit();
    }
}
