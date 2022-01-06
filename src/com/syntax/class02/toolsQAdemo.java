package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsQAdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe"); //setting the property
        WebDriver driver = new ChromeDriver();//create an obj of chromedriver
        driver.get("https://demoqa.com/text-box");
        WebElement textBox = driver.findElement(By.className("form-control"));
        textBox.sendKeys("fkfjfdc");
    }
}
