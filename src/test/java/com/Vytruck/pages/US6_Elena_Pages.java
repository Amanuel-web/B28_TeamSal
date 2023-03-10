package com.Vytruck.pages;

import com.Vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US6_Elena_Pages {


    public US6_Elena_Pages(){


        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicle;

    @FindBy(xpath = "(//td[@class='action-cell grid-cell grid-body-cell'])[1]")
public  WebElement threeDots;










}
