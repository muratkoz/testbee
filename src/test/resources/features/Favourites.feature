@favourite
Feature: Favorites feature

  Background:
    Given the user is on the main page

 Scenario: There are items at Favorites
      When the user click on "Favourites"
      Then "No favourites yet" message should appear at Favorites
      Given the user navigates to "Jewellery" module
      When the user navigates to "Necklaces" second module
      And the user navigates to "Chains" second module
      And the user adds items to favorites
      When the user click on "Favourites"
      Then the user should be able to see the favorited items
      And the user removes favorited items
      When the user click on "Home"
      When the user click on "Favourites"
      Then "No favourites yet" message should appear at Favorites


