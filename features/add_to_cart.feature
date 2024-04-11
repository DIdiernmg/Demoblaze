# language: en

Feature: Add Products to Cart and Place Order

  As a customer on the e-commerce website
  I want to add products to my cart and place an order
  So that I can purchase the items I need

  Scenario: customer adds products to the cart and places an order successfully
    Given the customer is on the product listing page
    When the customer adds a product to the cart
    And the customer navigates to the cart page
    Then the customer should see the product listed in the cart

    When the customer clicks on the checkout button
    And the customer provides the shipping and payment information
    And the customer confirms the order details
    And the customer clicks on the place order button
    Then the customer should receive a confirmation that the order has been placed
