import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        System.out.println(title);

        //id
//        WebElement uname =driver.findElement(By.name("username"));
//        uname.sendKeys("Admin");
//        uname.clear();

        WebElement uemail = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        uemail.sendKeys("useremail@gmail.com");
        uemail.clear();

        WebElement upass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        upass.sendKeys("pass@123");
        upass.clear();

//        WebElement upass = driver.findElement(By.name("password"));
//        upass.sendKeys("admin123");

//        WebElement ulog = driver.findElement(By.cssSelector("button[type='submit']"));
//        ulog.click();
//        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//        element.click();

//        System.out.println(driver.findElements(By.tagName("img")).stream().count());

//        WebElement element = driver.findElement(By.xpath("//*[@name=\"usernameOrEmail\"]"));
//        element.sendKeys("Username");
//
//        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
//        element1.click();

//        uname.clear();
//        upass.clear();
        System.out.println("Text Field Cleared");

    }
}
