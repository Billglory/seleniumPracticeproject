package cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_FullScreenMode {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        WebElement luckyText = driver.findElement(By.id("RNmpXc"));

        String text= luckyText.getAttribute("value");

        if (text.equals("Kendimi Şanslı Hissediyorum")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

    }
}