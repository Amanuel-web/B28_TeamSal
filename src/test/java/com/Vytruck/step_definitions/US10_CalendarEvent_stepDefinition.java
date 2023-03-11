package com.Vytruck.step_definitions;

import com.Vytruck.pages.LoginPage;
import com.Vytruck.pages.US10_CalendarEventPage;
import com.Vytruck.utilities.BrowserUtils;
import com.Vytruck.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US10_CalendarEvent_stepDefinition {

US10_CalendarEventPage calendarEventPage = new US10_CalendarEventPage();


    @When("user click the Calendar Events under the Activities")
    public void user_click_the_calendar_events_under_the_activities() {
        calendarEventPage.activities.click();

        BrowserUtils.sleep(2);
        calendarEventPage.calendarEventButton.click();
    }


    @When("user click the Create Calendar Event button")
    public void user_click_the_create_calendar_event_button() {
        calendarEventPage.createCalendarEvent.click();


    }
    @When("write a message in the Description field")
    public void write_a_message_in_the_description_field() {
       // BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame(calendarEventPage.iframe);

        BrowserUtils.sleep(2);

      calendarEventPage.textBox.sendKeys("Scrum daily meeting"+Keys.ENTER);

    }


    @Then("user should verify the message Scrum daily meeting is written in the input box")
    public void user_should_verify_the_message_scrum_daily_meeting_is_written_in_the_input_box() {



        Assert.assertTrue(calendarEventPage.textBox.isDisplayed());


        Driver.getDriver().switchTo().parentFrame();



    }


}
