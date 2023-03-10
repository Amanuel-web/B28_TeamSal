
#Feature:  As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

  #Background: User is already in the log in page
    #Given the user is on the login page


  #Scenario Outline: US9AC1TC1/2 Verify repeat number can not be less than 0 and more than 99 under recurring events
    #Given the user logged in as "sales manager"
    #When the user navigates to "Activities" - "Calendar Events"
    #And the user click on Create Calendar Event button
    #And the user click on repeat check box
    #When the calendar event repeat field is cleared
    #Then the user enter "<number>" to repeat checkbox
    #Then the user should see "<warning message>" warning


   # Examples:
    #  | number | warning message                        |
    #  | -1     | The value have not to be less than 1.  |
    #  | 111    | The value have not to be more than 99. |


















#Feature:As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

#Scenario:users see error messages for entering invalid integers.
 # Given the user logged in as "sales manager"
  #When user hover to Activities dropdown
  #And user click Calendar Events
  #And user click Create Calendar Event
  #And user click Repeat radio button
  #And user enters negative number
 #Then user see "The value have not to be less than 1." message
 #And user enters number bigger than 99
 #Then user see second "The value have not to be more than 99." message
