@jewellery
Feature: Jewellery module

  Background:
    Given the user is on the main page
    Given the user navigates to "Jewellery" module

  Scenario: User can see correct number of Solitaire Rings
    When the user navigates to "Rings" second module
    And the user navigates to "Solitaire Rings" second module
    Then "109,108" items should be found


  Scenario: User can see correct number of Chains
    When the user navigates to "Necklaces" second module
    And the user navigates to "Chains" second module
    Then "117,421" items should be found