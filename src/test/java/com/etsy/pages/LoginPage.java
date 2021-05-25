package com.etsy.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "com.etsy.android:id/btn_link")
    public MobileElement getStarted;

    @FindBy(id = "com.etsy.android:id/edit_username")
    public MobileElement usernameBox;

    @FindBy(id = "com.etsy.android:id/edit_password")
    public MobileElement passwordBox;

    @FindBy(id = "com.etsy.android:id/button_signin")
    public MobileElement signInButton;



}
