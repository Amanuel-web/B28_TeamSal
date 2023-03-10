
@Contracts
Feature: As a user, I want to access to Vehicle contracts page

  Background: User is already in the log in page
    Given the user is on the login page


@StoreManager
  Scenario: Store managers access the Vehicle contracts page.
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    When user clicks on Fleet tab
    Then user should click on Vehicle Contract page
    Then user should be on All Vehicle Contract page

  Scenario: Store managers access the Vehicle contracts page.
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    When user clicks on Fleet tab
    Then user should click on Vehicle Contract page
    Then user should be on All Vehicle Contract page


@Driver
Scenario: Drivers can NOT access the Vehicle contracts page.
  Given the user logged in with username as "user1" and password as "UserUser123"
  When user clicks on Fleet tab
  Then user should click on Vehicle Contract page
  Then user should see an error message "You do not have permission to perform this action"