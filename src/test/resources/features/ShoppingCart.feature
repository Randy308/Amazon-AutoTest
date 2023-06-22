Feature: Shopping Cart

  Scenario: Verify that the product remains in the shopping cart after logging in
    Given I am on home page
    And I have added a product to my shopping cart
    When I login with "randyh308@gmail.com" and password "c3czM3RDNG40cnkxNA=="
    Then I should see the product in my shopping cart