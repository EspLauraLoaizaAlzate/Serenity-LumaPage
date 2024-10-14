Feature: purchase flow
  Scenario: complete to purchase flow in Luma page
    Given Laura is signs in on Luma Page
    When she adds a product to cart
    Then she finishes the purchase flow

#  Scenario: complete purchase with an invalid payment method
#    Given Laura is signs in on Luma Page
#    When she adds a product to cart
#    And she attempts to use an invalid payment method
#    Then she should see an error message
#
#  Scenario: add multiple products to the cart
#    Given Laura is signs in on Luma Page
#    When she adds multiple products to the cart
#    Then all products should be in the cart
#
#  Scenario: complete purchase with insufficient stock
#    Given Laura is signs in on Luma Page
#    When she adds a product with insufficient stock to cart
#    Then she should see a notification about the stock availability
#
#  Scenario: cancel the purchase process
#    Given Laura is signs in on Luma Page
#    When she adds a product to cart
#    And she cancels the purchase process
#    Then she should be redirected to the homepage