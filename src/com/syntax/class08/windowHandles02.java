package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        WebElement newTab = driver.findElement(By.cssSelector("button#tabButton"));
        WebElement newWindow = driver.findElement(By.cssSelector("button#windowButton"));

        newTab.click();
        newWindow.click();
        //print the handle of the main/home/parent page
        //getWindowHandle returns the handle of current window so no sets
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent window handle is "+ parentHandle);
        //switch to a new tab and get the text
        //we need to switch the focus of selenium to NewTab
        //we get all the handles, so we can switch to the desired one
        //1.get all the handles
        Set<String> allHandles = driver.getWindowHandles();
        //2.find the desired handle i.e. of newtab by iterating through the set
        Iterator<String> iterator = allHandles.iterator();
        //iterate through each handle
        while (iterator.hasNext()) {
            //get the first handle
            String ChildHandle = iterator.next();
            //switch the focus of the selenium to the handle
            driver.switchTo().window(ChildHandle);
            //make sure that this is a correct tab or window
            if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
// successfull switch
        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());
        //click on new message button
        //driver.switchTo().defaultContent();
        driver.switchTo().window(parentHandle);
        //click on new window with message btn
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();
        driver.quit();


    }
}