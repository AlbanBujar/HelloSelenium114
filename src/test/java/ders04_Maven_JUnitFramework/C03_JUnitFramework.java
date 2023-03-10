package ders04_Maven_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_JUnitFramework {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //1- https://www.amazon.com/ sayfasina gidelim
       driver.get("https://www.amazon.com/");

        //2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));



        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones" + Keys.ENTER);
        WebElement bulunanSonuc = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));


        //4- Bulunan sonuc sayisini yazdiralim

        String expectedbBulunanSonuc = "1-16 of 242 results for \"Samsung headphones\"";
        String actualResult = bulunanSonuc.getText();
        System.out.println("Bulunan sonuc"+bulunanSonuc);

        //5- Ilk urunu tiklayalim
        WebElement ilkUrun = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));

        ilkUrun.click();

        //6- Sayfadaki tum basliklari yazdiralim

     WebElement result = driver.findElement(By.xpath("//h1[@id='title']"));




    }

}
