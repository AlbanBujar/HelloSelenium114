package ders03_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_TextileXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

// Bu sayfaya gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        /*
         6 locator
         id  name  classname   tagname  linktext  partialLinkText
         */

        // Add element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();


        // Delete butonu gorunur oldugunu test edin
        WebElement deleteButtonu = driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteButtonu.isDisplayed()) {
            System.out.println("Delete butonu gorunuyor Test PASSED");
        } else {
            System.out.println("Delete butonu gorunMuyor Test FailED");
        }

        // Delete butonuna basin
        driver.findElement(By.xpath("//button[text()='Delete']")).click();

        // " Add / Remove Elements" yazisinin gorunur oldugunu test edin

        WebElement addRemoveText = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        // * yildizin anlami :  tag name onemli degil


        if (addRemoveText.isDisplayed()) {
            System.out.println("Add Remove Yazisi gorunuyor Test PASSED");
        } else {
            System.out.println("Add Remove Yazisi gorunMuyor Test FailED");
        }
        Thread.sleep(2000);

        driver.close();

    }
}
