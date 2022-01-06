package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe"); //setting the property
        WebDriver driver = new ChromeDriver(); //create an obj of chromedriver
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        //next we need to inspect to find a locator:ex. name,id,class...

        //will locate the web element by dividing by portions -->
          WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); //returns a web element
          username.sendKeys("Tester");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");






    }
}
