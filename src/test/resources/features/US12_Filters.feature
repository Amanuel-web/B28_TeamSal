@login
Feature: As a user, I want to filter customers’ info on the Account page.

  Background: User is already in the log in page
    Given the user is on the login page


 @filter
  Scenario: Verify Filter Options for Store Manager
      Given the user logged in as "sales manager"
      When user clicks Customers tab.
      And user clicks Accounts option.
      And user click filter button.
      Then user should see following options

        | Account Name  |
        | Contact Name  |
        | Contact Email |
        | Contact Phone |
        | Owner         |
        | Business Unit |
        | Created At    |
        | Updated At    |


