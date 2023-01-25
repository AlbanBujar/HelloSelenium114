package ders01_SeleniumaGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        // gerekli ayarlamalari yapip, driver'i olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //amazon sayfasina gidin
        driver.get("https://www.amzaon.com");

        //amazon sayfasina gittiginizi test edin
        //System.out.println(driver.getCurrentUrl());
        String expectedText = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedText)){
            System.out.println("Teste PASSED");
        }else {
            System.out.println("Url, istenen metni icermiyor, Teste FAILED");
        }
        Thread.sleep(5000);
        driver.close();
    }
}
