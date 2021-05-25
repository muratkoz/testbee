package com.etsy.step_definitions;


import com.etsy.utilities.ConfigurationReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Initialize {
    public static AndroidDriver<MobileElement> driver;

    @Before
    public  void setup() {
        initializeDriver();

        driver.resetApp();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }
        driver.quit();
    }

    public void initializeDriver() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigurationReader.get("platform_name"));
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, ConfigurationReader.get("version"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigurationReader.get("device")); //R5CR121Y8LR //R3CR20M0ZCD //Nexus5
        desiredCapabilities.setCapability(MobileCapabilityType.APP, ConfigurationReader.get("app_path"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigurationReader.get("automation_name"));
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, false);

        desiredCapabilities.setCapability("unicodeKeyboard", "true");
        desiredCapabilities.setCapability("resetKeyboard", "true");

        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

