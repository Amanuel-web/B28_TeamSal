
Feature: As a user, I want to filter customers’ info on the Account page.

 @filter
  Scenario: Verify Filter Options for Store Manager and Sales Manager
      Given the user logged in as "driver"
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


