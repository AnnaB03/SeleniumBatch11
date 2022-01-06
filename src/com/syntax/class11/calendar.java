package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendar {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //code to login
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        //click on leave button
        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();

        //****Dealing with calendars******
        driver.findElement(By.cssSelector("input#calFromDate")).click();
        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        //use select class
        Select select = new Select(month);
        select.selectByVisibleText("Aug");
        //select the year
        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        Select select1 = new Select(year);
        select1.selectByValue("2022");
        //find the element of the table

        List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for(WebElement date:dates) {
            String dateText = date.getText();
            if (dateText.equalsIgnoreCase("5")) {
                date.click();
            }
        }

    }
}