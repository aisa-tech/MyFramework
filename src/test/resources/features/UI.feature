Feature: Shopping cart
  As a user, I want to be able to add items to my shopping cart and view the total cost before purchasing.

@ui@vip
  Scenario: Add item to cart
    Given I am on the Blue Origin shopping page
    When I go to shop all new page
    Then I add an item to my cart
    And the item should appear in my cart


