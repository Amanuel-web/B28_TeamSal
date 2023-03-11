package com.Vytruck.pages;

import com.Vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_Filters_Locators {

    public US12_Filters_Locators() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])")
    public WebElement optionDropdown;


    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement customers_tab;

    @FindBy(xpath = "(//span[.='Accounts'])[1]")
    public WebElement accounts_tab;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filters;

     @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[1]")
     public WebElement account_name;

    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[2]")
    public WebElement contact_name;

    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[3]")
    public WebElement contact_email;

    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[4]")
    public WebElement contact_phone;

    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[5]")
    public WebElement owner;

    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[6]")
    public WebElement businessUnit;

    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[7]")
    public WebElement created_at;

    @FindBy(xpath = "(//div[@class='filter-item oro-drop'])[8]")
    public WebElement updated_at;






}
