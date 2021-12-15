@BankManagerAddCustomer
Feature: Bank manager should add customer successfully and open account successfully.

  @Smoke
  Scenario: Bank manager should login and add customer successfully
    Given User is on homepage
    When User clicks on Bank Manager Login Tab
    And User click on add customer tab
    And User enter firstame <"Kirshna">
    And User enter lastname <"Patel">
    And User enter postcode <"Ha7 1HJ">
    And User click on add customer button
    Then User should see customer added successfully message
    And User should accept alert

  @Smoke, @Sanity
  Scenario: Bank manager should open account successfully
    Given User is on homepage
    When User clicks on Bank Manager Login Tab
    And User click on add customer tab
    And User enter firstame <"krishna">
    And User enter lastname <"Patel">
    And User enter postcode <"Ha8 1GF">
    And User click on add customer button
    And User should see customer added successfully message
    And User should accept alert
    And User click on home button
    And User clicks on Bank Manager Login Tab
    And User clicks on open account tab
    And User select customer search <"6">
    And User select currency <"pound">
    And User click on process button
    Then User should see customer account details <"Account created successfully with account Number :1016">

  @Sanity, @Regression
  Scenario: Customer should login and logout successfully
    Given User is on homepage
    When User clicks on Bank Manager Login Tab
    And User click on add customer tab
    And User enter firstame <"James">
    And User enter lastname <"Bond">
    And User enter postcode <"SU38UN">
    And User click on add customer button
    And User should see customer added successfully message
    And User should accept alert
    And User click on home button
    When User clicks on customer login tab
    And User search for customer from dropdown <"6">
    And User click on login button
    And User should see logout button and logout successfully<"James Bond">

  @Regression
  Scenario: Customer should deposit money successfully
    Given  Given User is on homepage
    When User clicks on Bank Manager Login Tab
    And User click on add customer tab
    And User enter firstame <"James">
    And User enter lastname <"Bond">
    And User enter postcode <"SU38UN">
    And User click on add customer button
    And User should see customer added successfully message
    And User should accept alert
    And User click on home button
    And User clicks on Bank Manager Login Tab
    And User clicks on open account tab
    And User select customer search <"6">
    And User select currency <"pound">
    And User click on process button
    Then User should see customer account details <"Account created successfully with account Number :1016">
    When User click on home button
    When User clicks on customer login tab
    And User search for customer from dropdown <"6">
    And User click on login button
    And User click on deposit money tab
    And User enter amount <"100">
    And User click on deposit amount button
    Then User should see money deposited successfully message

  @Regression
  Scenario: Customer should withdraw money successfully
    Given  Given User is on homepage
    When User clicks on Bank Manager Login Tab
    And User click on add customer tab
    And User enter firstame <"James">
    And User enter lastname <"Bond">
    And User enter postcode <"SU38UN">
    And User click on add customer button
    And User should see customer added successfully message
    And User should accept alert
    And User click on home button
    And User clicks on Bank Manager Login Tab
    And User clicks on open account tab
    And User select customer search <"6">
    And User select currency <"pound">
    And User click on process button
    Then User should see customer account details <"Account created successfully with account Number :1016">
    When User click on home button
    When User clicks on customer login tab
    And User search for customer from dropdown <"6">
    And User click on login button
    And User click on deposit money tab
    And User enter amount <"100">
    And User click on deposit amount button
    Then User should see money deposited successfully message
    And User should click on withdrawal tab
    And  User enter withdraw amount <"50">
    And User click on withdraw button
    Then User should see withdrawal successful message