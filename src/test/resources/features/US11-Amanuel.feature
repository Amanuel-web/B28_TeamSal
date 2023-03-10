@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

    @us11
  Scenario Outline: Verify managers can not access vehicle odometer
    Given the user logged in as "<managerType>"
    When user click the Vehicle Odometer under the fleet2
    Then verify the manager see you do not have permission to perform this action

    Examples: types of managers to login as
      |managerType|
      |sales manager|
      |store manager|
@us11
  Scenario: verify driver should see the default page number as 1
    Given user login as driver
    When user click the Vehicle Odometer under the fleet
    Then verify the default page number is "1"
@us11
  Scenario: verify driver should see the view per page is 25 by default
    Given user login as driver
    When user click the Vehicle Odometer under the fleet
    Then verify the default view per page is "25"

