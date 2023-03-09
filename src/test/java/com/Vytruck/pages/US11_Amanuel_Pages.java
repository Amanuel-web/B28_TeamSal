package com.Vytruck.pages;

import com.Vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_Amanuel_Pages {

    public US11_Amanuel_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement VehicleOdometerButton2;


    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement Fleet;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement DriverFleet;

    @FindBy(xpath = "//li[.='Vehicle Odometer']")
    public WebElement DriverVehicleOdometer;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement PermissionMessage;

}
