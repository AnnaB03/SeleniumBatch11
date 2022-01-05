package com.syntax.class12;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;

public class Task2HWDashboardPage extends CommonMethods {
    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy (id = "txtPassword")
    public WebElement password;

    @FindBy (id = "btnLogin")
    public WebElement loginBtn;

    @FindBy (id = "welcome")
    public WebElement welcome;

    public Task2HWDashboardPage() {

        PageFactory.initElements(driver,this);
    }
}
