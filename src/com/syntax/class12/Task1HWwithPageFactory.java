package com.syntax.class12;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1HWwithPageFactory extends CommonMethods {

    @FindBy (id = "txtUsername")
    public WebElement username;

    @FindBy (id = "txtPassword")
    public WebElement password;

    @FindBy (id = "btnLogin")
    public WebElement loginBtn;

    public Task1HWwithPageFactory() {

        PageFactory.initElements(driver,this);
    }



}

