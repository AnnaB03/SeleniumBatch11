package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;

public class homeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("anna");
        driver.findElement(By.name("lastname")).sendKeys("bugrinskaya");
        driver.findElement(By.name("reg_email__")).sendKeys("8003392255");
        driver.findElement(By.name("reg_passwd__")).sendKeys("ghj236");

        Select sel=new Select(driver.findElement(By.name("birthday_month")));
        Thread.sleep(2000);
        sel.selectByVisibleText("Oct");

        Select sel1 = new Select(driver.findElement(By.id("day")));
        Thread.sleep(2000);
        sel1.selectByVisibleText("10");

        Select sel2 = new Select(driver.findElement(By.name("birthday_year")));
        Thread.sleep(2000);
        sel2.selectByVisibleText("1995");

        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();

        driver.close();








    }
    }

