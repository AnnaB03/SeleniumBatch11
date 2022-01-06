package com.syntax.class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*task2:(use advance xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credenitals” is displayed.*/

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
            driver.manage().window().maximize();

            WebElement username = driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
            username.sendKeys("Admin");
            WebElement password = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
            password.sendKeys("12589hgjn");
            WebElement login  = driver.findElement(By.xpath("//input[starts-with(@value,'LOG')]"));
            login.click();
            WebElement verify = driver.findElement(By.xpath("//input[@name='Submit']/following-sibling::span"));
            System.out.println(verify.getText());


        }
    }

