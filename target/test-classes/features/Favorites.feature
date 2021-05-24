@favorite
Feature: Favorites feature

  Background:
    Given the user is on the main page

    Scenario: There is no item at Favorites
      When the user click on "Favorites"
      Then "No favorites yet" message should appear at Favorites

#  Scenario: Verify the items are at Favorites
#    When the user adds a product to favorites
#    And the user click on "Favorites"
#    Then the product should be at Favorites
