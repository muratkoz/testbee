@you
Feature: You functionality

  Background:
    Given the user is on the main page

  Scenario: Checkbox should be selected
    When the user click on "You"
    And the user click on "Settings"
    When the user click on checkbox
    Then the checkbox should be checked

  Scenario: Legal page should be opened
    When the user click on "You"
    And the user click on "Settings"
    When the user click on "Legal"
    And the user click on "Accept"
    Then Legal page should be opened


  Scenario: Notification page should have the first notification
    When the user click on "You"
    And the user click on "Notifications"
    Then First notification should appear

