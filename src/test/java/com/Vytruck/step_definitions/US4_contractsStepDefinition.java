package com.Vytruck.step_definitions;

import com.Vytruck.pages.US4_contractsLocators;
import com.Vytruck.utilities.BrowserUtils;
import com.Vytruck.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class US4_contractsStepDefinition {

    US4_contractsLocators us4 = new US4_contractsLocators();


    @Given("user logged in as a {string}")
    public void user_logged_in_as_a(String string) {

        System.out.println("User logged in as a store manager");

    }
    @When("user clicks on Fleet tab")
    public void user_clicks_on_fleet_tab() {

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.moveToElement(us4.fleetTab).click().perform();

        //us4.fleetTab.click();

    }
    @Then("user should click on Vehicle Contract page")
    public void user_should_click_on_vehicle_contract_page() {

        us4.vehicleContracts.click();

        BrowserUtils.sleep(5);

    }
    @Then("user should be on All Vehicle Contract page")
    public void user_should_be_on_all_vehicle_contract_page() {


        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        //System.out.println("expectedTitle = " + expectedTitle);
        //System.out.println("actualTitle = " + actualTitle);

        Assert.assertTrue(expectedTitle.equals(actualTitle));





        /*try{
            String actualTitle = Driver.getDriver().getTitle();
            actualTitle = actualTitle.substring(0, actualTitle.indexOf("Contract"));
            String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
            Assert.assertTrue(expectedTitle.equals(actualTitle));
        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Test Passed!");

        }*/


        //System.out.println(actualTitle);


    }

    @Then("user should see an error message {string}")
    public void user_should_see_an_error_message(String string) {

        Assert.assertTrue(us4.errorMessage.isDisplayed());

    }
}
