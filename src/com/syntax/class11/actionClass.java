package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class actionClass {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        //locate the draggable
        WebElement draggable = driver.findElement(By.cssSelector("div#draggable"));
        //locate the drop off location
        WebElement dropoff = driver.findElement(By.cssSelector("div#droppable"));

        Actions action = new Actions(driver);
        //drag the source to drop off
        //action.dragAndDrop(draggable,dropoff).perform();

        action.clickAndHold(draggable).moveToElement(dropoff).release().build().perform();


    }
}