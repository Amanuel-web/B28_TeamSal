package com.Vytruck.step_definitions;

import com.Vytruck.pages.MainModulePage_Mohamed;
import com.Vytruck.utilities.ConfigurationReader;
import com.Vytruck.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

import java.util.List;

public class US81_StepDefs {
    MainModulePage_Mohamed page = new MainModulePage_Mohamed();
    @Then("Verify the Store and sales managers  view all the {int} module names:")
    public void verify_the_store_and_sales_managers_view_all_the_module_names(int num, List<String> list) {
List < WebElement> listOfElement = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assert.assertEquals(num, listOfElement.size());
        for (int i = 0; i < listOfElement.size(); i++) {
            Assert.assertEquals(list.get(i), listOfElement.get(i).getText());
            Assert.assertTrue(listOfElement.get(i).isDisplayed());
        }
    }

    @Then("Verify the Driver view all the {int} module names:")
    public void verify_the_driver_view_all_the_module_names(int num, List<String> list) {
        List < WebElement> listOfElement = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assert.assertEquals(num, listOfElement.size());
        for (int i = 0; i < listOfElement.size(); i++) {
            Assert.assertEquals(list.get(i), listOfElement.get(i).getText());
            Assert.assertTrue(listOfElement.get(i).isDisplayed());
        }
    }
    }
