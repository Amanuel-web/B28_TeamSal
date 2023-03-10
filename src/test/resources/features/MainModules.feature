@moo
Feature: As a user, I should be accessing all the main modules of the app.
  Background: User is already in the log in page
    Given the user is on the login page
    @Moe81
  Scenario:  Verify users accessing all the main modules of the app.
      Given the user logged in as "sales manager"
     Then Verify the Store and sales managers  view all the 8 module names:
         | Dashboards        |
         | Fleet             |
         | Customers         |
         | Sales             |
         | Activities         |
         | Marketing         |
         |Reports & Segments |
         | System            |
      @Moe-81
  Scenario: Verify users accessing all the main modules of the app.
        Given the user logged in as "driver"
        Then  Verify the Driver view all the 4 module names:

            | Fleet      |
            | Customers  |
            | Activities |
            | System     |
