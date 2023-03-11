package com.Vytruck.step_definitions;

import com.Vytruck.pages.US6_Elena_Pages;
import com.Vytruck.utilities.BrowserUtils;
import com.Vytruck.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class US06_Elena_step_definitions {

    //  @Given("the user is on the home page")
    // public void the_user_is_on_the_home_page() {

    US6_Elena_Pages us6_elena_pages = new US6_Elena_Pages();

    @Given("Users are on the home page")
    public void users_are_on_the_home_page() {
        BrowserUtils.sleep(2);
        String expectedHomePageTitle = "Dashboard";
        String actualTitleHomePage = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedHomePageTitle, actualTitleHomePage);
        BrowserUtils.sleep(2);

    }

    @When("user click  Vehicle under the Fleet")
    public void user_click_vehicle_under_the_fleet() {
 BrowserUtils.sleep(2);
        us6_elena_pages.fleet.click();
        us6_elena_pages.vehicle.click();
    }

    @When("Verify any car info has {int} dots {string} , and there are  : ,,view, edit , delete \" icons")
    public void verify_any_car_info_has_dots_and_there_are_view_edit_delete_icons(Integer int1, String string) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us6_elena_pages.threeDots).perform();
        Assert.assertTrue(us6_elena_pages.threeDots.isDisplayed());
        System.out.println("us6_elena_pages.threeDots.isDisplayed() = " + us6_elena_pages.threeDots.isDisplayed());

    }
}









