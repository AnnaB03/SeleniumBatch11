package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=3A45955CBF2A8A47F68C02CD6ABA5F8A");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Anna");
        driver.findElement(By.id("customer.lastName")).sendKeys("Bugrinskaya");
        driver.findElement(By.id("customer.address.street")).sendKeys("111 Kings ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11201");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("222-333-4444");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-456-7899");
        driver.findElement(By.id("customer.username")).sendKeys("annab");
        driver.findElement(By.id("customer.password")).sendKeys("qwe1358");
        driver.findElement(By.id("repeatedPassword")).sendKeys("qwe1358");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Register")).click();
        driver.close();

    }
}
