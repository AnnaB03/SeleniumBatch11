package com.syntax.test;

import com.syntax.pages.loginPageWithPageFactory;
import com.syntax.testBase.baseClass;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {
        //open the browser and navigate
        baseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //create an object of loginPageWithPageFactory
        loginPageWithPageFactory loginWPG = new loginPageWithPageFactory();
        loginWPG.username.sendKeys("Admin");
        loginWPG.password.sendKeys("Hum@nhrm123");
        loginWPG.loginBtn.click();

        //close the browser
        baseClass.tearDown();

    }
}
