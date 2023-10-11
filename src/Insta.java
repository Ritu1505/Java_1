import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Insta {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.instagram.com/accounts/login/?hl=en");

        driver.findElement(By.xpath("//span[text()=\"Sign up\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"emailOrPhone\"]")).sendKeys("6543281305");
        driver.findElement(By.xpath("//input[@name=\"fullName\"]")).sendKeys("Rituparna Singh");
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("rituparnasingh22");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("ritU@1234");
        driver.findElement(By.xpath("//button[text()=\"Sign up\"]")).click();

        WebElement month = driver.findElement(By.xpath("//select[@title=\"Month:\"]"));
        month.click();
        Select month_dd = new Select(month);
        month_dd.selectByValue("5");

        WebElement day = driver.findElement(By.xpath("//select[@title=\"Day:\"]"));
        day.click();
        Select day_dd = new Select(day);
        day_dd.selectByValue("15");

        WebElement year = driver.findElement(By.xpath("//select[@title=\"Year:\"]"));
        year.click();
        Select year_dd = new Select(year);
        year_dd.selectByValue("2000");

        driver.findElement(By.xpath("//button[text()=\"Next\"]")).click();

    }
}
