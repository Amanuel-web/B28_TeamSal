
Feature: As a user , i want to see edit car info icons from the Vehicle page

#Background:  User is already in the home page
 # Given the user is on the home page

@wip
  Scenario: user see the car edited options on the  vehicle page
  Given the user logged in as "storemanager85"
    When user click  Vehicle under the Fleet
    And Verify any car info has 3 dots "..." , and there are  : ,,view, edit , delete " icons



