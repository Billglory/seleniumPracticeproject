package cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_LocateElementBypartialLinkText {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/?gl=us&hl=en&pws=0&gws_rd=cr");

        WebElement helpfultext = driver.findElement(By.partialLinkText("Helpful tips"));

        System.out.println(helpfultext.getText());

        driver.quit();


    }


}
