package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageobject.SearchCustomer;

public class SaerchCusStepdefs {

    SearchCustomer searchCustomer = new SearchCustomer(Hooks.chromelauncher);


    @When("user enters email id in emailid feild {string}")
    public void userEntersEmailIdInEmailidFeild(String email) {

        searchCustomer.setSearchEmailId(email);

    }

    @And("user click on search button")
    public void userClickOnSearchButton() throws InterruptedException {
        searchCustomer.clickSearchButton();
        Thread.sleep(1000);
    }

    @Then("user search the customeremail id in customer table")
    public void userSearchTheCustomeremailIdInCustomerTable() throws InterruptedException {
      Boolean status =   searchCustomer.searchCusByEmail("victoria_victoria@nopCommerce.com");
        Thread.sleep(1000);
        Assert.assertTrue(true, String.valueOf(status));

    }

    @When("user enters first name")
    public void userEntersFirstName() {
        searchCustomer.setSearchFirstName("Victoria");
    }

    @And("user enter last name")
    public void userEnterLastName() {
        searchCustomer.setSearchLastName("Terces");
    }

    @Then("user validate the customer name in customer table")
    public void userValidateTheCustomerNameInCustomerTable() throws InterruptedException {
        Boolean status =searchCustomer.searchCusByName("Victoria Terces");
        Thread.sleep(1000);
        Assert.assertTrue(true, String.valueOf(status));

    }
}
