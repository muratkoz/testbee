package com.etsy.step_definitions;

import com.etsy.pages.DashboardPage;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class You {
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user click on checkbox")
    public void the_user_click_on_checkbox() {
        dashboardPage.wait.until(ExpectedConditions.visibilityOf(dashboardPage.checkbox));
        dashboardPage.checkbox.click();

    }

    @Then("the checkbox should be checked")
    public void the_checkbox_should_be_checked() {
        Assert.assertFalse(dashboardPage.checkbox.isSelected());
    }

    @When("the user click on Settings")
    public void the_user_click_on_Settings() {
        new DashboardPage().element("Settings").click();
    }

}
