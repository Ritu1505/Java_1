import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.List<org.openqa.selenium.WebElement>;

import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        //self
        String text = driver.findElement(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/self::a")).getText();
        System.out.println(text);

        //parent
        text = driver.findElement(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/parent::td")).getText();
        System.out.println(text);

        //ancestor
        text = driver.findElement(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/ancestor::tr")).getText();
        System.out.println(text);

        //child
        List<WebElement> child = (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/ancestor::tr/child::td"));
        System.out.println(child.size());

        //descendant
        List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/ancestor::tr/descendant::*"));
        System.out.println(descendant.size());

        //preceding
        List<WebElement> precedingNode = driver.findElements(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/ancestor::tr/preceding::tr"));
        System.out.println(precedingNode.size());

        //preceding-sibling
        List<WebElement> precedingsibling = driver.findElements(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println(precedingsibling.size());

        //following
        List<WebElement> followingNode =driver.findElements(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/ancestor::tr/following::tr"));
        System.out.println(followingNode.size());

        //following-sibling
        List<WebElement> followingSibling =driver.findElements(By.xpath("//a[contains(text(),'YES Bank Ltd.')]/ancestor::tr/following-sibling::tr"));
        System.out.println(followingSibling.size());

        driver.close();

    }
}
