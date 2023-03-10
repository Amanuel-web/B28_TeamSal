package com.Vytruck.step_definitions;

import com.Vytruck.pages.LoginPage;
import com.Vytruck.pages.US11_Amanuel_Pages;
import com.Vytruck.utilities.BrowserUtils;
import com.Vytruck.utilities.ConfigurationReader;
import com.Vytruck.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US11_Amanuel_stepDef {

       US11_Amanuel_Pages us11Pages = new US11_Amanuel_Pages();

    LoginPage loginPage = new LoginPage();

    @When("user click the Vehicle Odometer under the fleet2")
    public void user_click_the_vehicle_odometer_under_the_fleet() {

        us11Pages.Fleet.click();

        BrowserUtils.sleep(2);

        us11Pages.VehicleOdometerButton2.click();

    }

    @Then("verify the manager see you do not have permission to perform this action")
    public void verify_the_manager_see_you_do_not_have_permission_to_perform_this_action() {

         Assert.assertTrue(us11Pages.PermissionMessage.isDisplayed());

    }

    @Given("user login as driver")
    public void user_login_as_driver() {

        String username = null;
        String password = null;


        username = ConfigurationReader.getProperty("driver_username");
        password = ConfigurationReader.getProperty("driver_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);


    }
    @When("user click the Vehicle Odometer under the fleet")
    public void userClickTheVehicleOdometerUnderTheFleet() {

       // BrowserUtils.sleep(2);

        us11Pages.DriverFleet.click();

        //BrowserUtils.sleep(3);

        us11Pages.DriverVehicleOdometer.click();

    }

    @Then("verify the default page number is {string}")
    public void verify_the_default_page_number_is(String valueOfExpectedDefaultPageNum) {

        String valueOfDefaultPagNum = Driver.getDriver().findElement(By.xpath("//input[@type='number']")).getAttribute("value");

        Assert.assertEquals(valueOfDefaultPagNum, valueOfExpectedDefaultPageNum);

    }

    @Then("verify the default view per page is {string}")
    public void verify_the_default_view_per_page_is(String valueOfExpectedViewPage) {

        String valueOfDefaultViewPageNum = Driver.getDriver().findElement(By.xpath("//button[@class='btn dropdown-toggle ']")).getText();

        Assert.assertEquals(valueOfExpectedViewPage,valueOfDefaultViewPageNum);


    }


}
