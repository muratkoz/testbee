package com.etsy.step_definitions;

import com.etsy.pages.BasePage;
import com.etsy.pages.DashboardPage;
import com.etsy.pages.SearchAndBasketPage;
import com.google.common.base.Verify;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class SearchAndBasket {
    DashboardPage dashboardPage = new DashboardPage();
    SearchAndBasketPage searchAndBasket = new SearchAndBasketPage();

    @When("the user searchs item {string}")
    public void the_user_searchs_item(String string) throws InterruptedException {
        dashboardPage.searchBox.sendKeys(string);
        Thread.sleep(1000);
        dashboardPage.enter();
        Thread.sleep(2000);


    }

    @When("the user click on the item")
    public void the_user_click_on_the_item() throws InterruptedException {
        Thread.sleep(3000);
        searchAndBasket.product.click();
    }

    @When("clicks on Add to basket button")
    public void clicks_on_Add_to_basket_button() {
        searchAndBasket.addToBasket.click();
    }

    @When("clicks on Basket button")
    public void clicks_on_Basket_button() {
        searchAndBasket.basket.click();
    }

    @Then("user should be able to see the item at Basket")
    public void user_should_be_able_to_see_the_item_at_Basket() {
        Assert.assertTrue(searchAndBasket.product.isDisplayed());
    }

}
