Feature:As a user, I should be able to select any vehicle from the Vehicle page




  # CREDENTIALS For Login    Username                   and              Password
  # 1-)                     = user1–100                                   UserUser123
  # 2-) For a Sale Manager = salesmanager10  --- -- 150, 251 -- 300      UserUser123
  # 3-) For a Store Manager =storemanager51--- 100, 201 -- 250           UserUser123



  ## Test case 1
  @wip
  Scenario: users view unchecked checkboxes on the Vehicle page
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    Given Users are on the homepage
    Then Click the Vehicle under the Fleet
    And Verify all the checkboxes are unchecked


  ## Test case 2
  @wip
  Scenario: users check the first checkbox to check all the cars
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    Given Users are on the homepage
    Then Click the Vehicle under the Fleet
    Then Click the 1st checkbox in the web-table
    And Verify all the checkboxes also checked

    ##Test case 3
  @wip
  Scenario: users check any car’s checkbox
    Given the user logged in with username as "storemanager85" and password as "UserUser123"
    Given Users are on the homepage
    Then Click the Vehicle under the Fleet
    Then Check any car’s checkbox
    And Verify the box is checked

