package com.syntax.class06;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class multipleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //find the webElement dropDown
        WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));
        //we can use select class so will make an object of select class
        Select select = new Select(statesDD);
        //check if the drop is multiple
        boolean itisMult = select.isMultiple();
        System.out.println(itisMult);

        //select by index - starts from 0
        select.selectByIndex(0);
        Thread.sleep(2000);

        select.selectByVisibleText("Texas");
        Thread.sleep(2000);

        select.selectByValue("Ohio");
        Thread.sleep(2000);

        select.deselectByIndex(0);
        Thread.sleep(2000);

        select.deselectByValue("Ohio");
        Thread.sleep(2000);

        select.deselectByVisibleText("Texas");
        Thread.sleep(2000);

        //use iterator to get all the options and print in consoles

      List<WebElement> allOptions = select.getOptions();
        Iterator<WebElement> itr = allOptions.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getText());
        }








    }
}