@login
Feature: Login functionality

  Scenario Outline: User Logs in with valid credentials
    When user clicks on Get Started button
    And user enters valid "<username>" and "<password>"
    Then main page should be opened
    Examples:
      |username            |password                |
      |mmrtkz@gmail.com    |TestBee123              |


  Scenario Outline: User enters invalid credentials
    When user clicks on Get Started button
    And user enters invalid "<email>" and valid or invalid "<password>"
    Then "Email address is invalid." message should appear
    Examples:
      |email                      |password                |
      |invalidemail@gmail.com     |TestBee123              |
      |nameandsurname@testbee.com |invalidpassword         |
      |test123.com@               |mmrtkz@gmail.com        |
      |@                          |@@@@@                   |


  Scenario Outline: User enters invalid credentials
    When user clicks on Get Started button
    And user enters invalid "<username>" and valid or invalid "<password>"
    Then "Username is invalid." message should appear
    Examples:
      |username                   |password                |
      |invalidemail.gmail.com     |testtest                |
      |nameandsurname             |invalidpassword         |
      |TeBee147test               |TestBee123              |
      |murat123                   |@@@@@                   |


  Scenario Outline: User enters invalid credentials
    When user clicks on Get Started button
    And user enters valid "<email>" and invalid "<password>"
    Then "Password was incorrect." message should appear
    Examples:
      |email               |password                |
      |mmrtkz@gmail.com    |mmrtkz@gmail.com        |
      |mmrtkz@gmail.com    |123456789               |


#  Scenario Outline: User enters invalid credentials
#    When user clicks on Get Started button
#    And user enters valid "<email>" and invalid "<password>"
#    Then "You have exceeded the max number of login attempts. Please try again in an hour" message should appear
#    Examples:
#      |email               |password                |
#      |mmrtkz@gmail.com    |mmrtkz@gmail.com        |
#      |mmrtkz@gmail.com    |123456789               |
#      |mmrtkz@gmail.com    |TestBee123              |

