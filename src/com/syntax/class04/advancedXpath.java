package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advancedXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
        password.sendKeys("Hum@nhrm12");
        WebElement login  = driver.findElement(By.xpath("//input[starts-with(@value,'LOG')]"));
        login.click();

////span[@id='spanMessage']

    }
}
