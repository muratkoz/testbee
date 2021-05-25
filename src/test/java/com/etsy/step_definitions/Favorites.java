package com.etsy.step_definitions;

import com.etsy.pages.DashboardPage;
import com.etsy.pages.FavoritesPage;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Favorites {
    DashboardPage dashboardPage = new DashboardPage();
    FavoritesPage favoritesPage = new FavoritesPage();

    @When("the user click on {string}")
    public void the_user_click_on(String string) throws InterruptedException {
        dashboardPage.waitUntil(dashboardPage.element(string)).click();
    }

    @Then("{string} message should appear at Favorites")
    public void message_should_appear_at_Favorites(String string) {
        Assert.assertEquals(string,favoritesPage.noFavoritesMessage.getText());
        System.out.println(favoritesPage.noFavoritesMessage.getText());
    }

    @And("the user adds items to favorites")
    public void theUserAddsItemsToFavorites() {
        for (MobileElement addToFavorite : favoritesPage.addToFavorites) {
            addToFavorite.click();
        }
    }

    @Then("the user should be able to see the favorited items")
    public void theUserShouldBeAbleToSeeTheFavoritedItems() {
        for (MobileElement favoritedItem : favoritesPage.favoritedItems) {
            Assert.assertTrue(favoritedItem.isDisplayed());
        }
    }


    @And("the user removes favorited items")
    public void theUserRemovesFavoritedItems() {
        for (MobileElement addToFavorite : favoritesPage.addToFavorites) {
            addToFavorite.click();
        }
    }

}
