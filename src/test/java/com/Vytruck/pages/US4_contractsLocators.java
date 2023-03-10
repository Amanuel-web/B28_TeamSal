package com.Vytruck.pages;

import com.Vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US4_contractsLocators {

    public US4_contractsLocators(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']")
    public WebElement fleetTab;

    @FindBy(xpath = "//li[@class='dropdown-menu-single-item'][3]")
    public WebElement vehicleContracts;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allVehicle_ContractPage;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;






}
