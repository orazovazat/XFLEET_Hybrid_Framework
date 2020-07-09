package xfleet.tests.cucumber.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import xfleet.utilities.ConfigurationReader;
import xfleet.utilities.Pages;

public class LoginStepDefinitions {
    Pages pages = new Pages();

    @Given("user is on landing page")
    public void user_is_on_landing_page() {
        pages.loginPage().goToLandingPage();
    }

    @Then("user logs in as store manager")
    public void user_logs_in_as_store_manager() {
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        pages.loginPage().login(username, password);
    }

    @Then("user verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String expected) {
        Assert.assertEquals(expected, pages.dashboardPage().getPageSubTitle());
    }

}
