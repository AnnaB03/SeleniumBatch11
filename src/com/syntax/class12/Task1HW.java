package com.syntax.class12;

import com.syntax.pages.loginPage;
import com.syntax.testBase.baseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class Task1HW {

    public static void main(String[] args) {
        baseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        loginPage loginPage = new loginPage();
        WebElement username = loginPage.usernameField;
        CommonMethods.sendText(username, "Admin");
        WebElement password = loginPage.passwordField;
        CommonMethods.sendText(password,"admin");
        loginPage.loginBtn.click();
        CommonMethods.takeTheScreenShot("wrong password");
        baseClass.tearDown();


    }

}
