package com.etsy.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class SearchAndBasketPage extends BasePage{

    @FindBy(xpath = "//*[@text='Add to basket']")
    public MobileElement addToBasket;

    @FindBy(id = "com.etsy.android:id/listing_title")
    public MobileElement product;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Cart tab, 5 of 5\"]/android.widget.ImageView")
    public MobileElement basket;




}
