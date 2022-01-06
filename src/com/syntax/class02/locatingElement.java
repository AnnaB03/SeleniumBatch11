package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
            driver.get("http://www.facebook.com");
            driver.findElement(By.id("email")).sendKeys("annabugrinskaya@gmail.com");
            driver.findElement(By.name("pass")).sendKeys("ghgjdkslmc");
            //driver.findElement(By.name("login")).click();
            //<a anchor tag, contains link
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forg")).click();
        driver.quit();

    }
}
