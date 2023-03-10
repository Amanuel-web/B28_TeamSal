@B28G47-121
Feature: Default

	Background:
		#@B28G47-122
		Given the user is on the login page
		


	@B28G47-120
	Scenario Outline: US9AC1TC1/2 Verify repeat number can not be less than 0 and more than 99 under recurring events
		Given the user logged in as "sales manager"
		    When the user navigates to "Activities" - "Calendar Events"
		    And the user click on Create Calendar Event button
		    And the user click on repeat check box
		    When the calendar event repeat field is cleared
		    Then the user enter "<number>" to repeat checkbox
		    Then the user should see "<warning message>" warning
		
		
		    Examples:
		      | number | warning message                        |
		      | -1     | The value have not to be less than 1.  |
		      | 111    | The value have not to be more than 99. |