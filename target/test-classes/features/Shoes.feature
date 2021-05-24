Feature: Shoes module

  Background:
    Given the user is on the main page
    Given the user navigates to "Shoes" module

@shoe
  Scenario: User can see correct number of Women Boots products
    When the user navigates to "Women's Shoes" second module
    And the user navigates to "Boots" second module
    Then "38,544" items should be found


  Scenario: User can see correct number of Clogs&Mules products
    When the user navigates to "Boys' Shoes" second module
    And the user navigates to "Clogs & Mules" second module
    Then "106" items should be found