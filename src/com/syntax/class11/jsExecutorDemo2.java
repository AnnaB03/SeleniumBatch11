package com.syntax.class11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorDemo2 {
    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll down
        js.executeScript("window.scrollBy(0,4000)", "");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-4000)", "");
        //scroll till the element is in view
        WebElement backtoTop = driver.findElement(By.cssSelector("span.navFooterBackToTopText"));
        js.executeScript("arguments[0].scrollIntoView(true)",backtoTop);
    }
}