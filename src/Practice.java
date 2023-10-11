import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://blazedemo.com/");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement departure = driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
        Select dep_dd = new Select(departure);
        dep_dd.selectByValue("San Diego");

        WebElement destination = driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
        Select des_dd = new Select(destination);
        des_dd.selectByValue("Berlin");

        driver.findElement(By.xpath("//input[@value=\"Find Flights\"]")).click();

        driver.findElement(By.xpath("//tr[2]/td[1]")).click();

        driver.findElement(By.xpath("//input[@id=\"inputName\"]")).sendKeys("Rituparna");
        driver.findElement(By.xpath("//input[@id=\"address\"]")).sendKeys("Address");
        driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Durgapur");
        driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("West Bengal");
        driver.findElement(By.xpath("//input[@id=\"zipCode\"]")).sendKeys("713205");
        WebElement visa = driver.findElement(By.xpath("//select[@id=\"cardType\"]"));
        Select visa_dd = new Select(visa);
        visa_dd.selectByValue("dinersclub");
        driver.findElement(By.xpath("//input[@id=\"creditCardNumber\"]")).sendKeys("234576541329");
        driver.findElement(By.xpath("//input[@id=\"creditCardMonth\"]")).sendKeys("01");
        driver.findElement(By.xpath("//input[@id=\"creditCardYear\"]")).sendKeys("2030");
        driver.findElement(By.xpath("//input[@id=\"nameOnCard\"]")).sendKeys("Rituparna Singh");
        driver.findElement(By.xpath("//input[@id=\"rememberMe\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();


//        driver.get("https://demo.applitools.com/");
//        String title = driver.getTitle();
//        System.out.println(title);
//
//        driver.findElement(By.id("username")).sendKeys("Admin");
//        driver.findElement(By.id("password")).sendKeys("Password");
//        driver.findElement(By.xpath("//label[text()=\"Remember Me\"]")).click();
//        driver.findElement(By.xpath("//a[@id=\"log-in\"]")).click();
    }
}
