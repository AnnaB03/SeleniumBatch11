package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reviewExplicit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait");
        //locate the enable after 10 sec button and click on it
        WebElement button = driver.findElement(By.cssSelector("button#enable-button"));
        button.click();
        //print the state of the button after it is enabled
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));
        //print if button is enabled or not
        WebElement button1 = driver.findElement(By.cssSelector("button#disable"));
        //button.click();
        System.out.println(button1.isEnabled());



    }
}