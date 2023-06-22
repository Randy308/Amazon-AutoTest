Feature: Wishlist

    Scenario Outline: Search mobile phones
        Given I am on home page
        When I search with <email> and <password>
        Then I should see <product> in the wishlist
        Examples:
            | email                 | password        | product      |
            | "randyh308@gmail.com" | "sw33tC4n4ry14" | "Hola Randy" |