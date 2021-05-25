package com.etsy.pages;

import com.etsy.step_definitions.Initialize;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;


    public BasePage(){
        this.driver= Initialize.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver,10);
    }

    public MobileElement waitUntil(MobileElement element){
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
    }

    public MobileElement element(String string) throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(By.xpath("//*[@text='"+string+"']"));
    }




//    public void enter() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.hideKeyboard();
////        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//        driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "next"));
//        Thread.sleep(2000);
////        Actions action = new Actions(driver);
////        action.sendKeys(Keys.ENTER).build().perform();
//          driver.getKeyboard().sendKeys(Keys.ENTER);
////        dashboardPage.searchBox.sendKeys(string+"\n");
//
////        dashboardPage.enter();
////        ((AndroidDriver)driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
//    }

}