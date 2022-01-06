package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class workingWithKeys {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));

        //send username
        username.sendKeys("Tester", Keys.TAB);
        //send password
        password.sendKeys("test",Keys.ENTER);
        //taking a screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        //to take a screenshot, this step takes the screenshot
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        //save the screenshot in our computer
        try {
            //copy the screenshot to a new directory inside the project and give a path to that particular screenshot
            FileUtils.copyFile(sourceFile,new File("screenshot/smartBear/login/adminlogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
