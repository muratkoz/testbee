package com.etsy.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class HomeLivingPage extends BasePage{

    @FindBy(id = "com.etsy.android:id/result_count")
    public MobileElement numberOfItems;

}
