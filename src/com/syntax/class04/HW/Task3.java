package com.syntax.class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
/*task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Anna");
        driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Bugrinskaya");
        driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("annab@yahoo.com");
        driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys("123-123-1223");
        driver.findElement(By.cssSelector("input[name*='address']")).sendKeys("1212Kings ave");
        driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("Brooklyn");
        driver.findElement(By.cssSelector("select[name*='state']")).click();
        driver.findElement(By.xpath("//option[text()='New York']")).click();
        driver.findElement(By.cssSelector("input[name*='zip']")).sendKeys("11255");
        driver.findElement(By.cssSelector("input[name*='website']")).sendKeys("www.AB.com");
        driver.findElement(By.cssSelector("input[value*='no']")).click();
        driver.findElement(By.cssSelector("textarea[name*='comment']")).sendKeys("Some Text");





    }
}