package com.Vytruck.step_definitions;

import com.Vytruck.pages.CalendarEventsPage_Alex;
import com.Vytruck.utilities.BrowserUtils;
import com.Vytruck.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US9_StepDefs extends CalendarEventsPage_Alex {
CalendarEventsPage_Alex calendarEventsPage=new CalendarEventsPage_Alex();
    Actions hover =new Actions(Driver.getDriver());

    @When("the user navigates to {string} - {string}")
    public void the_user_navigates_to(String string, String string2) {
        BrowserUtils.sleep(5);
        calendarEventsPage.Activities.click();
       BrowserUtils.sleep(2);
        CalendarEvents.click();
    }
    @When("the user click on Create Calendar Event button")
    public void the_user_click_on_create_calendar_event_button() {
     BrowserUtils.sleep(5);
        hover.moveToElement(calendarEventsPage.createCalendarEventButton);
        createCalendarEventButton.click();
    }
    @When("the user click on repeat check box")
    public void the_user_click_on_repeat_check_box() {
       calendarEventsPage.repeatCheckBox.click();
    }
    @When("the calendar event repeat field is cleared")
    public void the_calendar_event_repeat_field_is_cleared() {

        calendarEventsPage.repeatEveryInputBox.clear();
    }
    @Then("the user enter {string} to repeat checkbox")
    public void theUserEnterToRepeatCheckbox(String num) {
        calendarEventsPage.repeatEveryInputBox.sendKeys(num);
        BrowserUtils.waitFor(5);
    }

    @Then("the user should see {string} warning")
    public void theUserShouldSeeWarning(String expected) {
        String actualHeaderText=warningMessage.getText();



        Assert.assertEquals(actualHeaderText,expected);

    }


   /* @Then("the user should see {string} warning")
    public void the_user_should_see_warning(String) {
        String actualHeaderText=warningMessage.getText();

        List<String>expectedText  = new List<String>();
        expectedText.add("The value have not to be less than 1.");
        expectedText.add("The value have not to be more than 99.");
        Assert.assertEquals(actualHeaderText,expectedText);
    }*/

}
