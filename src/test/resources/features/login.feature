@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "sales manager"
    Given the user logged in with username as "salesmanager101" and password as "UserUser123"





