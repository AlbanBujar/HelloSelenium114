package ders02_driverNavigateMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com");

        // arama cubugunda Nutella yazip aratalim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        Thread.sleep(2000);

        // bir de Java aratalim
        aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.clear(); // Nutellayi silip Java yazacagiz
        aramaKutusu.sendKeys("Java" + Keys.ENTER);


        Thread.sleep(1000);
        driver.close();

    }
}
