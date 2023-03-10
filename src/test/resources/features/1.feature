@B28G47-102
Feature: Default


	@B28G47-98
	Scenario: AC1: User should be able to write a description  to create calendar event
		Scenario: User should be able to write a description  to create calendar event
		    Given user are on the homepage
		    When user click the Calendar Events under the Activities
		    And user click the Create Calendar Event button
		    And write a message in the Description field
		    Then user should verify the message Scrum daily meeting is written in the input box