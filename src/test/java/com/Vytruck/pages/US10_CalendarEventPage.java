package com.Vytruck.pages;

import com.Vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_CalendarEventPage {

    public US10_CalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[3]")
    public WebElement activities;

    @FindBy(xpath ="(//span[@class='title title-level-2'])[9]")
    public WebElement calendarEventButton;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;

    //div[@id='mceu_24']")
    //body[@id='tinymce']"


    @FindBy(xpath ="//body[@class='mce-content-body ']")
    public WebElement iframe;


    @FindBy(tagName = "p")
    public WebElement textBox;












    @FindBy(id="prependedInput")
    public WebElement userName;


    @FindBy(id="prependedInput2")
    public WebElement password;


    @FindBy(name = "_submit")
    public WebElement submit;


}
