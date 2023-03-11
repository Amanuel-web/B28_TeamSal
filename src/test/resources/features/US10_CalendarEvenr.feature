Feature: Calendar event functionality
  Agile Story: As a user, I want to write the "Description" when I create a calendar event

  @B28G47-102
  Scenario: User should be able to write a description  to create calendar event
    Given the user logged in as "driver"
    #Given user are on the homepage
    When user click the Calendar Events under the Activities
    And user click the Create Calendar Event button
    And write a message in the Description field
    Then user should verify the message Scrum daily meeting is written in the input box
