import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Keka_login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tftus.keka.com/#/me/attendance/logs");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[text()=\"Remote Clock-In\"]")).click();
        driver.findElement(By.xpath("//textarea[\"reason\"]")).sendKeys("Training(Java Selenium Automation");
    }
}
