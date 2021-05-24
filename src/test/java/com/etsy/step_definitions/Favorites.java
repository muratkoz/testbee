package com.etsy.step_definitions;

import com.etsy.pages.DashboardPage;
import com.etsy.pages.FavoritesPage;
import com.etsy.pages.HomeLivingPage;
import com.etsy.utilities.ScrollHelper;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Favorites {
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user click on {string}")
    public void the_user_click_on(String string) {
        dashboardPage.element(string).click();
    }

    @When("the user adds a product to favorites")
    public void the_user_adds_a_product_to_favorites() throws InterruptedException {
        dashboardPage.searchBox.click();
        dashboardPage.categories.click();
        dashboardPage.navigateTo("Jewelry");
        new HomeLivingPage().navigateToSecondModule("Watches");
        new FavoritesPage().heart.click();
    }

    @Then("the product should be at Favorites")
    public void the_product_should_be_at_Favorites() {
        Assert.assertTrue(new FavoritesPage().favoriItem.isDisplayed());
        System.out.println(new FavoritesPage().favoriItem.getText());
    }

    @Then("{string} message should appear at Favorites")
    public void message_should_appear_at_Favorites(String string) {
        Assert.assertEquals(string,new FavoritesPage().noFavoritesMessage.getText());
        System.out.println(new FavoritesPage().noFavoritesMessage.getText());
    }

}
