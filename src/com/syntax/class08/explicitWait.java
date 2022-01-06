package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class explicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
        //use explicit wait to make sure the element has met a certain condition
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#enableAfter")));
//locate the button
        WebElement button = driver.findElement(By.cssSelector("button#enableAfter"));
        button.click();

        System.out.println(button.isEnabled());
    }
}