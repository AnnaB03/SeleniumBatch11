package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        //declaring an implicit way for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //find the button to click on
        WebElement getNewUser = driver.findElement( By.cssSelector("button#save"));
        getNewUser.click();
        //get new user first name
        WebElement firstName = driver.findElement(By.xpath("//div[@id='First-Name']/p"));//whose child is /p
        System.out.println(firstName.getText());
        WebElement lastName = driver.findElement(By.xpath("//div[@id='Last-Name']/p"));
        System.out.println(lastName.getText());


    }
}