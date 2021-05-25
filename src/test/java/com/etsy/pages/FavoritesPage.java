package com.etsy.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FavoritesPage extends BasePage{

    @FindBy(xpath = "//*[@text='No favourites yet']")
    public MobileElement noFavoritesMessage;

    @FindBy(xpath = "//*[@resource-id='com.etsy.android:id/btn_fav']")
    public List<MobileElement> addToFavorites;

    @FindBy(xpath = "//*[@resource-id='com.etsy.android:id/listing_image']")
    public List<MobileElement> favoritedItems;

    @FindBy(id = "com.etsy.android:id/listing_title")
    public MobileElement favoriItem;
}
