package com.etsy.step_definitions;

import com.etsy.pages.DashboardPage;
import com.etsy.pages.HomeLivingPage;
import com.etsy.pages.LoginPage;
import com.etsy.utilities.ScrollHelper;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Modules {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomeLivingPage homeLivingPage = new HomeLivingPage();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() throws InterruptedException {
        loginPage.getStarted.click();
        loginPage.usernameBox.sendKeys("mmrtkz@gmail.com");
        loginPage.passwordBox.sendKeys("TestBee123");
        loginPage.signInButton.click();
        Thread.sleep(1000);
    }

    @When("the user navigates to {string} module")
    public void the_user_navigates_to_module(String string) throws InterruptedException {
        dashboardPage.searchBox.click();
        dashboardPage.categories.click();
        dashboardPage.navigateTo(string);
    }

    @When("the user navigates to {string} second module")
    public void the_user_navigates_to_second_module(String string) throws InterruptedException {
        dashboardPage.navigateToSecondModule(string);
    }

    @Then("the user should be able to see following {string}")
    public void the_user_should_be_able_to_see_following(String string) throws InterruptedException {
        new ScrollHelper().scrollVerticalHelper(string);
        MobileElement product = homeLivingPage.element(string);
        Assert.assertTrue(product.isDisplayed());
        System.out.println(product.getText());
    }

    @Then("{string} items should be found")
    public void items_should_be_found(String expectedNumber) {
        String actualNumber = homeLivingPage.numberOfItems.getText().substring(0,homeLivingPage.numberOfItems.getText().indexOf(" "));
        Assert.assertEquals(expectedNumber,actualNumber);
    }

    @Given("the user click on searchbox")
    public void theUserClickOnSearchbox() {
        dashboardPage.searchBox.click();
    }

}
