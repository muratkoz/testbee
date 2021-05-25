@modules
Feature: Navigating To Modules

  Background:
    Given the user click on searchbox

  Scenario Outline: User can see correct number of searched products
    Given the user navigates to "<firstmodule>" module
    When the user navigates to "<secondmodule>" second module
    And the user navigates to "<thirdmodule>" second module
    Then "<numberofresults>" items should be found
    Examples:
      | firstmodule   | secondmodule     | thirdmodule     | numberofresults |
      | Home & Living | Bedding          | Baby Nests      | 3,764           |
      | Home & Living | Kitchen & Dining | Drink & Barware | 3,110,298       |
      | Jewellery     | Necklaces        | Chains          | 149,633         |


#  Scenario: User can see correct number of Office Furniture products
#    Given the user navigates to "Home & Living" module
#    When the user navigates to "Kitchen & Dining" second module
#    And the user navigates to "Drink & Barware" second module
#    Then "3,113,163" items should be found

