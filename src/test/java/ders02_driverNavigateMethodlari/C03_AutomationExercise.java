package ders02_driverNavigateMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_AutomationExercise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://automationexercise.com/");


        // sayfada 184 adet link bulundugunu test edin

        List<WebElement> linkElementleriListesi = driver.findElements(By.name("a"));

        int expectedLinkSayisi = 195;
        int actualLinkSayisi = linkElementleriListesi.size();

        if(expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Belirtilen sayida link yok, Test FAILED");
        }

        // products linkine tiklayin
        WebElement productsLinki = driver.findElement(By.partialLinkText("Products"));
        productsLinki.click();

        // special offer yazisinin gorundugunu test edin
        WebElement specialOffer = driver.findElement(By.id("sale_image"));

        if (specialOffer.isDisplayed()){
            System.out.println("Special offer yazisi gorundu: Test Passed");
        }else {
            System.out.println("Special offer yazisi gorunmedi: Test Failed");
        }

        driver.close();


    }
}
