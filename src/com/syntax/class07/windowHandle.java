package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

        //to get an address/handle of the page/window
        String signUpPage = driver.getWindowHandle();
        System.out.println("The window handle for signup page is "+ signUpPage);
        //click on help, terms and privacy
        WebElement helpBTN = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termBTN = driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacyBTN = driver.findElement(By.xpath("//a[text()='Privacy']"));


        helpBTN.click();
        termBTN.click();
        privacyBTN.click();

       Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("the number of window handles is "+allWindowHandles);

        //in order to print all window handles we need to iterate over the Set
        Iterator<String> it = allWindowHandles.iterator();
        signUpPage=it.next();
        String helpBTNhandle = it.next();
        String termBTNhandle = it.next();
        String privacyBTNhandle = it.next();

        System.out.println("the handle for main page is "+signUpPage);
        System.out.println("the handle for main page is "+helpBTNhandle);
        System.out.println("the handle for main page is "+termBTNhandle);
        System.out.println("the handle for main page is "+privacyBTNhandle);
        
            //switch to privacy page
        driver.switchTo().window(privacyBTNhandle);
        System.out.println(driver.getTitle());
        driver.quit();
        }


    }
