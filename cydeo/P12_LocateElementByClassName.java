package cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementByClassName {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement helpfultext = driver.findElement(By.className("qarstb"));

        if (helpfultext.getText().equals("Helpfull")) {
            System.out.println("correctly");
        } else {
            System.out.println("not correctly");
        }


        driver.quit();
    }
}