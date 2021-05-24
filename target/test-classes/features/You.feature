@you
Feature: You functionality
  Background:
    Given the user is on the main page
  
  Scenario: Checkbox should be selected
    When the user click on "You"
    And the user click on "Settings"
    When the user click on checkbox
    Then the checkbox should be checked

