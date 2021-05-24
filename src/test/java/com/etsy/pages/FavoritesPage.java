package com.etsy.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class FavoritesPage extends BasePage{

    @FindBy(xpath = "//*[@text='No favorites yet']")
    public MobileElement noFavoritesMessage;

//    @FindBy(xpath = "//*[@text='Favorites']")
//    public MobileElement favorite;

    @FindBy(xpath = "//*[@text='Editors’ Picks']")
    public MobileElement editorsPicks;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add Handmade Apple Watch Band 38 mm 40 mm 42 mm 44 mm, Series 1 2 3 4 5 6 SE, Apple Watch strap for Her, Gift for Mom, iwatch band for her to favorites\"]")
    public MobileElement heart;

//    public MobileElement favorite = driver.findElement(MobileBy.AccessibilityId("Add Zero waste Linen bag set of 2. Two reuse produce bags. Sustainable eco friendly grocery shopping bags from Linen. Veggies and fruit bag to favorites"));

    @FindBy(id = "com.etsy.android:id/listing_title")
    public MobileElement favoriItem;
}
