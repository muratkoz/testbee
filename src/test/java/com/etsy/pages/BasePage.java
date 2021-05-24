package com.etsy.pages;

import com.etsy.step_definitions.Initialize;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
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

    public MobileElement element(String string){
        return driver.findElement(By.xpath("//*[@text='"+string+"']"));
    }

    public void enter() throws InterruptedException {
        Thread.sleep(2000);
        driver.getKeyboard().sendKeys(Keys.ENTER);
//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ENTER).build().perform();
//        dashboardPage.driver.getKeyboard().sendKeys(Keys.ENTER);
//        dashboardPage.searchBox.sendKeys(string+"\n");
//        ((AndroidDriver) dashboardPage.driver).pressKey(new KeyEvent(AndroidKey.ENTER));
//        dashboardPage.enter();
//        ((AndroidDriver)driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
    }

}