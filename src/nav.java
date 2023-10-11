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

public class nav {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
//        driver.get("https://amazon.com");
        driver.navigate().to("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

//        driver.navigate().back();
//        driver.navigate().forward();

//        driver.navigate().refresh();

        WebElement email = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
        email.sendKeys("username@gmail.com");
        email.clear();


    }
}
