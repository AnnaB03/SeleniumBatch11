package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    //set the path to the driver Executable
    //for windows user will use .exe but mac users don't need an .exe

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        //creating an object of Chromedriver
        WebDriver driver = new ChromeDriver();
        //calling to get method to get to a particular website
        driver.get("https://www.google.com/");

        //returns the current url loaded in the browser
        String url = driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is: "+ url);

        //returns the title of the current page in browser
        String title = driver.getTitle();
        System.out.println("the current title of the page is: "+ title);

        //close the browser
        driver.quit(); //will close the whole browser
    }
}