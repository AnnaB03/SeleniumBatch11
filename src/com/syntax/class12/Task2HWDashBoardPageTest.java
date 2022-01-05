package com.syntax.class12;

import com.syntax.pages.loginPage;
import com.syntax.testBase.baseClass;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class Task2HWDashBoardPageTest {
    public static void main(String[] args) {
        baseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        loginPage loginPage = new loginPage();
        WebElement username = loginPage.usernameField;
        CommonMethods.sendText(username, "Admin");
        WebElement password = loginPage.passwordField;
        CommonMethods.sendText(password, "Hum@nhrm123");
        loginPage.loginBtn.click();

        Task2HWDashboardPage task2HWDashboardPage = new Task2HWDashboardPage();
        System.out.println(task2HWDashboardPage.welcome.getText());






    }
}