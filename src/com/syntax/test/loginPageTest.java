package com.syntax.test;

import com.syntax.pages.loginPage;
import com.syntax.testBase.baseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class loginPageTest {

    public static void main(String[] args) {
    //open the browser and navigate to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard
        baseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //locate the Elements and send keys
        loginPage loginPage = new loginPage();

        WebElement password = loginPage.passwordField;
        CommonMethods.sendText(password,"Hum@nhrm123");
        WebElement username = loginPage.usernameField;
        CommonMethods.sendText(username,"Admin");



       /* loginPage.passwordField.sendKeys("Hum@nhrm123");
       loginPage.usernameField.sendKeys("Admin");
        loginPage.loginBtn.click();*/






    }

}
