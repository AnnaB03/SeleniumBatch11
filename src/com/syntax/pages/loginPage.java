package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage extends CommonMethods {

   public WebElement usernameField = driver.findElement(By.xpath("//*[@name='txtUsername']"));
    public WebElement passwordField = driver.findElement(By.xpath("//*[@name='txtPassword']"));
    public WebElement loginBtn = driver.findElement(By.xpath("//*[@name='Submit']"));

}