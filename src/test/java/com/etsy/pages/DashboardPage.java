package com.etsy.pages;

import com.etsy.step_definitions.Initialize;
import com.etsy.utilities.ScrollHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(id = "com.etsy.android:id/settings_checkbox")
    public MobileElement checkbox;

    @FindBy(id = "com.etsy.android:id/search_suggestion_large_header")
    public MobileElement categories;

    @FindBy(id = "com.etsy.android:id/largeLabel")
    public MobileElement homeButton;

    @FindBy(xpath = "//*[@text='You']")
    public MobileElement youButton;

    @FindBy(xpath = "//*[@text='Favorites']")
    public MobileElement favoritesButton;

    @FindBy(xpath = "//*[@text='Cart']")
    public MobileElement cartButton;

    @FindBy(xpath = "//*[@text='Settings']")
    public MobileElement settings;

    @FindBy(xpath = "//*[@text='Legal']")
    public MobileElement legal;

    @FindBy(xpath = "//*[@text='About This App']")
    public MobileElement about;

    @FindBy(id = "com.etsy.android:id/search_src_text")
    public MobileElement searchBox;

    public void navigateTo(String string) throws InterruptedException {
        MobileElement module = driver.findElement(By.xpath("//*[@text='"+string+"']"));
        waitUntil(module).click();
    }


}
