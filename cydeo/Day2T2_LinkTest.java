package cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2T2_LinkTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/");

        WebElement abtestLink= driver.findElement(By.linkText("A/B Testing"));
        abtestLink.click();


        String expectedTitle = " No A/B Testing";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("title Verification passed");
        } else
            System.out.println("title Verification failed");
driver.navigate().back();

        String expectedTitle2 ="Practice";
        actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("title Verification passed");
        } else
            System.out.println("title Verification failed");




    }
}