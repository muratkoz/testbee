@shoe
Feature: Shoes module

  Background:
    Given the user is on the main page
    Given the user navigates to "Shoes" module


  Scenario: User can see correct number of Men Boots products
    When the user navigates to "Men's Shoes" second module
    And the user navigates to "Boots" second module
    Then "11,745" items should be found


  Scenario: User can see correct number of Clogs&Mules products
    When the user navigates to "Boys' Shoes" second module
    And the user navigates to "Clogs & Mules" second module
    Then "106" items should be found