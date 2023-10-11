import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class FaceBook {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rituparna");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Singh");
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("useremail@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("useremail@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Ritu@1234");
        WebElement day =driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
        day.click();
        Select day_dd = new Select(day);
        day_dd.selectByValue("15");

        WebElement month =driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
        month.click();
        Select month_dd = new Select(month);
        month_dd.selectByValue("5");

        WebElement year =driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
        year.click();
        Select year_dd = new Select(year);
        year_dd.selectByValue("2000");

        driver.findElement(By.xpath("//input[@name=\"sex\"]")).click();

        driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();




    }
}
