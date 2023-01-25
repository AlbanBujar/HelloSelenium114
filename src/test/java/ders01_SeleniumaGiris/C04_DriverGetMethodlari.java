package ders01_SeleniumaGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getTitle());
        // IT Bootcamp, Distance education method - Wise Quarter Course

        System.out.println(driver.getCurrentUrl());
        //https://wisequarter.com/

        System.out.println(driver.getWindowHandle());
        //CDwindow-16DB3CFE4C552DF22ADC0F4E8B947D0F
        //Bu her yazdirdigimizda farkli olarak gelir

        Thread.sleep(5000);
        driver.close();

    }
}
