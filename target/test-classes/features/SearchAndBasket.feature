@search
Feature: Searching an item and adding to Basket

  Background:
    Given the user is on the main page

    Scenario: User searchs an item and adds to Basket
      When the user searchs item "appium"
      And the user click on the item
#      And clicks on Add to basket button
#      And clicks on Basket button
#      Then user should be able to see the item at Basket