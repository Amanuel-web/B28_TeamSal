package com.Vytruck.step_definitions;

import com.Vytruck.pages.LoginPage;
import com.Vytruck.pages.US07_Chngr_Page;
import com.Vytruck.utilities.BrowserUtils;
import com.Vytruck.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US07_Chngr_StepDefs {
    US07_Chngr_Page US07Chngr = new US07_Chngr_Page();
    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }


    @Given("Users are on the homepage")
    public void users_are_on_the_homepage() {

        BrowserUtils.sleep(2);
        String expectedHomePageTitle = "Dashboard";
        String actualTitleHomePage= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedHomePageTitle,actualTitleHomePage);
        BrowserUtils.sleep(2);

    }


    @Then("Click the Vehicle under the Fleet")
    public void click_the_vehicle_under_the_fleet() {
        BrowserUtils.sleep(2);
        US07Chngr.fleet.click();
        US07Chngr.vehicle.click();

    }

    @Then("Verify all the checkboxes are unchecked")
    public void verify_all_the_checkboxes_are_unchecked() {

        US07Chngr.checkBox.click();
        US07Chngr.unCheckedBox.click();

        Assert.assertFalse(US07Chngr.unCheckedBox.isSelected());
    }


    @Then("Click the 1st checkbox in the web-table")
    public void click_the_1st_checkbox_in_the_web_table() {
        US07Chngr.checkBox.click();

    }

    @Then("Verify all the checkboxes also checked")
    public void verify_all_the_checkboxes_also_checked() {

        Assert.assertTrue(US07Chngr.checkBox.isSelected());
    }


    @Then("Check any car’s checkbox")
    public void check_any_car_s_checkbox() {

        US07Chngr.anyCheckBox1.click();
        US07Chngr.anyCheckBox2.click();
        US07Chngr.anyCheckBox3.click();
        US07Chngr.anyCheckBox4.click();
        US07Chngr.anyCheckBox5.click();
        US07Chngr.anyCheckBox6.click();
        US07Chngr.anyCheckBox7.click();
        US07Chngr.anyCheckBox8.click();
        US07Chngr.anyCheckBox9.click();
        US07Chngr.anyCheckBox10.click();
        US07Chngr.anyCheckBox11.click();
        US07Chngr.anyCheckBox12.click();
        US07Chngr.anyCheckBox13.click();
        US07Chngr.anyCheckBox14.click();
        US07Chngr.anyCheckBox15.click();
        US07Chngr.anyCheckBox16.click();
        US07Chngr.anyCheckBox17.click();
        US07Chngr.anyCheckBox18.click();
        US07Chngr.anyCheckBox19.click();
        US07Chngr.anyCheckBox20.click();
        US07Chngr.anyCheckBox21.click();
        US07Chngr.anyCheckBox22.click();
        US07Chngr.anyCheckBox23.click();
        US07Chngr.anyCheckBox24.click();
        US07Chngr.anyCheckBox25.click();
    }

    @Then("Verify the box is checked")
    public void verify_the_box_is_checked() {



        Assert.assertTrue(US07Chngr.anyCheckBox1.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox2.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox3.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox4.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox5.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox6.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox7.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox8.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox9.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox10.isSelected());

        BrowserUtils.sleep(2);

        Assert.assertTrue(US07Chngr.anyCheckBox11.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox12.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox13.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox14.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox15.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox16.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox17.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox18.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox19.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox20.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox21.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox22.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox23.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox24.isSelected());
        Assert.assertTrue(US07Chngr.anyCheckBox25.isSelected());
    }

}

