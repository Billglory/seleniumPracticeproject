package cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3T1_locaters_getText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUsername =driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        WebElement inputPassword =driver.findElement(By.className("USER_PASSWORD"));
        inputPassword.sendKeys("İncorrect");

        WebElement loginButton =driver.findElement(By.className("login-btn"));
        loginButton.click();

        WebElement errorMessage =driver.findElement(By.className("errortext"));

        String expectedErrorMessage= "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message Passed!");

        } else {
            System.out.println("Error message Failed!!" );
        }









}
 }