package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToMenu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        Thread.sleep(2000);
        driver.navigate().to("http://www.amazon.com");//moving forward, moving backward and refreshing
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close(); //closes the current tab we are on
    }
}
