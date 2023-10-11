import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class raio_checkbox_dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.navigate().to("https://www.facebook.com/");
//        driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
        String title = driver.getTitle();
        System.out.println(title);

//        WebElement acc = driver.findElement(By.linkText("Create new account"));
//        acc.click();
//        driver.findElement(By.partialLinkText("Create a Page")).click();
//        WebElement element = driver.findElement(By.partialLinkText("Forgotten"));
//        element.click();
//
//        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//        Select day_dd = new Select(day);
//        day_dd.selectByValue("15");




        // Radio button
//        driver.navigate().to("https://demoqa.com/radio-button");
//        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
//        driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();

//        driver.navigate().to("https://demoqa.com/automation-practice-form");
//        driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Ritu");
//        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Singh");
//        driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("usermail@gmail.com");
//        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
//        driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("1234345632");
//        driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
//        driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
//        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
//        chooseFile.sendKeys("C:\\Users\\Rituparna-Singh\\Pictures\\Screenshots\\Screenshot 2023-09-04 103107.png");

//        driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]")).click();
//        WebElement date = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//        date.click();
//        Select date_dd = new Select(date);
//        date_dd.selectByValue("2000");
//
//        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//        month.click();
//        Select month_dd = new Select(month);
//        month_dd.selectByValue("4");
//
//        driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();

//        driver.findElement(By.xpath("//div[@class=\"subjects-auto-complete__placeholder css-1wa3eu0-placeholder\"]")).sendKeys("Java");
//        driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("Durgapur");
//        driver.findElement(By.xpath("//a[@id=\"close-fixedban\"]")).click();
//        driver.findElement(By.xpath(""))


//        driver.findElement(By.id("hobbies-checkbox-3")).click();
//        driver.findElement(By.xpath("dateOfBirthInput")).sendKeys("12 Aug 2023");

        driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.xpath("//a[@id=\"downloadButton\"]")).click();


    }
}
