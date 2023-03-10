package com.Vytruck.pages;

import com.Vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage_Alex extends BasePage{
    public CalendarEventsPage_Alex() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Activities']")
    public static WebElement Activities;
    @FindBy(xpath = "//span[.='Calendar Events']")
    public static WebElement CalendarEvents;



    @FindBy(xpath = "//a[normalize-space()='Create Calendar event']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath ="//input[starts-with(@id,\"recurrence-repeat\")]")
    public static WebElement repeatCheckBox;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryInputBox;


    @FindBy(xpath = "//span[@class='validation-failed']//span[1]")
    public WebElement warningMessage;


}
