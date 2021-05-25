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

    @FindBy(id = "com.etsy.android:id/notification_subtext")
    public MobileElement notificationMessage;

    @FindBy(id = "com.etsy.android:id/search_src_text")
    public MobileElement searchBox;

    public void navigateTo(String string) throws InterruptedException {
        MobileElement module = driver.findElement(By.xpath("//*[@text='"+string+"']"));
        waitUntil(module).click();
    }

    public void navigateToSecondModule(String string) throws InterruptedException {
        MobileElement module = driver.findElement(By.xpath("//*[@text='"+string+"']"));
        waitUntil(module).click();
    }


}
