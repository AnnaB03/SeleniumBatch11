package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadAFile {
    public static String url = "https://the-internet.herokuapp.com/upload";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //locate the choose the file button
        WebElement chooseFile = driver.findElement(By.cssSelector("input#file-upload"));
        //in order to upload the file - window based pop up - use javascript
        chooseFile.sendKeys("C:\\Users\\annab\\IdeaProjects\\SeleniumBatch11\\screenshot\\smartBear\\login\\adminlogin.png");
        //locate the submit and click upload
        driver.findElement(By.cssSelector("input#file-submit")).click();





    }
}