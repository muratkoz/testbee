package com.etsy.pages;

import com.etsy.utilities.ScrollHelper;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class HomeLivingPage extends BasePage{

    @FindBy(id = "com.etsy.android:id/result_count")
    public MobileElement numberOfItems;

    public void navigateToSecondModule(String string){
        element(string).click();
    }

}
