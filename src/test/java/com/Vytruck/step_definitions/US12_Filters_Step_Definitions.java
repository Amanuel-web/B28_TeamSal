package com.Vytruck.step_definitions;

import com.Vytruck.pages.US12_Filters_Locators;
import com.Vytruck.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US12_Filters_Step_Definitions {

    US12_Filters_Locators us_12 = new US12_Filters_Locators();

    @Given("user clicks Customers tab.")
    public void user_clicks_customers_tab() {
        BrowserUtils.sleep(2);
        us_12.customers_tab.click();
    }

    @Then("user clicks Accounts option.")
    public void user_clicks_accounts_option() {
        BrowserUtils.sleep(2);
        us_12.accounts_tab.click();
    }

    @When("user click filter button.")
    public void user_click_filter_button() {
        BrowserUtils.sleep(3);
        us_12.filters.click();
    }

    @Then("user should see following options")
    public void userShouldSeeFollowingOptions(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();
        actualOptions.add(us_12.account_name.getText().substring(0,us_12.account_name.getText().indexOf(":")));
        actualOptions.add(us_12.contact_name.getText().substring(0,us_12.contact_name.getText().indexOf(":")));
        actualOptions.add(us_12.contact_email.getText().substring(0,us_12.contact_email.getText().indexOf(":")));
        actualOptions.add(us_12.contact_phone.getText().substring(0,us_12.contact_phone.getText().indexOf(":")));
        actualOptions.add(us_12.owner.getText().substring(0,us_12.owner.getText().indexOf(":")));
        actualOptions.add(us_12.businessUnit.getText().substring(0,us_12.businessUnit.getText().indexOf(":")));
        actualOptions.add(us_12.created_at.getText().substring(0,us_12.created_at.getText().indexOf(":")));
        actualOptions.add(us_12.updated_at.getText().substring(0,us_12.updated_at.getText().indexOf(":")));

        Assert.assertEquals(expectedOptions,actualOptions);






    }
}
/*


    }

    */