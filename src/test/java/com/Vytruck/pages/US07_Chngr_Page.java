package com.Vytruck.pages;

import com.Vytruck.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_Chngr_Page {
    public US07_Chngr_Page(){
        PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicle;


    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement unCheckedBox;

    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[1]")
    public WebElement anyCheckBox1;


    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[2]")
    public WebElement anyCheckBox2;

    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[3]")
    public WebElement anyCheckBox3;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[4]")
    public WebElement anyCheckBox4;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[5]")
    public WebElement anyCheckBox5;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[6]")
    public WebElement anyCheckBox6;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[7]")
    public WebElement anyCheckBox7;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[8]")
    public WebElement anyCheckBox8;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[9]")
    public WebElement anyCheckBox9;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[10]")
    public WebElement anyCheckBox10;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[11]")
    public WebElement anyCheckBox11;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[12]")
    public WebElement anyCheckBox12;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[13]")
    public WebElement anyCheckBox13;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[14]")
    public WebElement anyCheckBox14;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[15]")
    public WebElement anyCheckBox15;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[16]")
    public WebElement anyCheckBox16;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[17]")
    public WebElement anyCheckBox17;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[18]")
    public WebElement anyCheckBox18;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[19]")
    public WebElement anyCheckBox19;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[20]")
    public WebElement anyCheckBox20;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[21]")
    public WebElement anyCheckBox21;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[22]")
    public WebElement anyCheckBox22;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[23]")
    public WebElement anyCheckBox23;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[24]")
    public WebElement anyCheckBox24;
    @FindBy (xpath = "(//input[@data-role='select-row-cell'])[25]")
    public WebElement anyCheckBox25;



}
