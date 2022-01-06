package com.syntax.utils;

import com.syntax.testBase.baseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends baseClass {

    /**
     * sends text to given element
     * @param element --> WebElement
     * @param text --> the text that yoy want to send
     */

    public static void sendText(WebElement element,String text) {
        element.clear();
        element.sendKeys(text);

    }

    public void switchToFrame(int index) {

        driver.switchTo().frame(index);
            }

    public static void takeTheScreenShot(String filename ){
        //        take screenshot
        TakesScreenshot ts=(TakesScreenshot) driver;
//        take screen shot
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
//        we need to save the screenshot file in our computer


        try {
            FileUtils.copyFile(screenShot,new File("screenshot/ss/"+filename+".png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}




